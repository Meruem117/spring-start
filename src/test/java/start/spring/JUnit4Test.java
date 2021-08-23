package start.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import start.spring.jdbc.entity.User;
import start.spring.jdbc.service.UserService;

import javax.annotation.Resource;

/**
 * @auther: Meruem117
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jdbc.xml")
public class JUnit4Test {

    @Test
    public void testLog() {
        final Logger log = LoggerFactory.getLogger(JUnit4Test.class);
        log.info("log");
    }

    @Test
    public void testGenericApplicationContext() {
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();

        // context.registerBean(User.class, () -> new User());
        // User user = (User) context.getBean("start.spring.jdbc.entity.User");

        context.registerBean("userBean", User.class, () -> new User());
        User user = (User) context.getBean("userBean");

        System.out.println(user);
    }

    @Resource
    private UserService userService;

    @Test
    public void testUserService() {
        int res = userService.selectCount();
        System.out.println(res);
    }
}
