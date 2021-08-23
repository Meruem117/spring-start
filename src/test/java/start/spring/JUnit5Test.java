package start.spring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import start.spring.jdbc.service.UserService;

import javax.annotation.Resource;

/**
 * @auther: Meruem117
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring-jdbc.xml")
public class JUnit5Test {
    @Resource
    private UserService userService;

    @Test
    public void testUserService() {
        int res = userService.selectCount();
        System.out.println(res);
    }
}
