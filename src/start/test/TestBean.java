package start.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import start.spring.bean.*;
import start.spring.service.UserService;

/**
 * @auther: Meruem117
 */
public class TestBean {
    @org.junit.Test
    public void TestUser1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User1 user = context.getBean("user1", User1.class);
        System.out.println(user);
        user.test();
    }

    @org.junit.Test
    public void TestUser2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User2 user = context.getBean("user2", User2.class);
        System.out.println(user);
        user.test();
    }

    @org.junit.Test
    public void TestUser3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User3 user = context.getBean("user3", User3.class);
        System.out.println(user);
        user.test();
    }

    @org.junit.Test
    public void TestUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.service();
    }

    @org.junit.Test
    public void TestStudent() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean("student", Student.class);
        student.test();
    }
}
