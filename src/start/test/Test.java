package start.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import start.spring.User;

/**
 * @auther: Meruem117
 */
public class Test {
    @org.junit.Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.test();
    }
}
