package start.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import start.spring.ioc.bean.User;
import start.spring.ioc.bean.base.User1;
import start.spring.ioc.bean.base.User2;
import start.spring.ioc.bean.base.User3;
import start.spring.ioc.bean.collection.Course;
import start.spring.ioc.bean.school.Student;
import start.spring.ioc.bean.autowire.Employee;
import start.spring.ioc.bean.life.Life;
import start.spring.ioc.config.SpringConfig;
import start.spring.ioc.service.UserService;
import start.spring.ioc.bean.annotation.Base;
import start.spring.ioc.service.annotation.BaseService;

/**
 * @auther: Meruem117
 */
public class IOCTest {
    @Test
    public void TestUser1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        User1 user = context.getBean("user1", User1.class);
        System.out.println(user);
        user.test();
    }

    @Test
    public void TestUser2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        User2 user = context.getBean("user2", User2.class);
        System.out.println(user);
        user.test();
    }

    @Test
    public void TestUser3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        User3 user = context.getBean("user3", User3.class);
        System.out.println(user);
        user.test();
    }

    @Test
    public void TestUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.service();
    }

    @Test
    public void TestStudent() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Student student = context.getBean("student", Student.class);
        student.test();
    }

    @Test
    public void TestCollection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Course course = context.getBean("course", Course.class);
        course.test();
    }

    @Test
    public void TestFactory() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        User user = context.getBean("factory", User.class);
        System.out.println(user);
    }

    @Test
    public void TestLife() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Life life = context.getBean("life", Life.class);
        System.out.println(4);
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void TestAutowire() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }

    @Test
    public void TestBase() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Base base = context.getBean("base", Base.class);
        base.test();
    }

    @Test
    public void TestBaseService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        BaseService baseService = context.getBean("baseService", BaseService.class);
        baseService.test();
    }

    @Test
    public void TestConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        BaseService baseService = context.getBean("baseService", BaseService.class);
        baseService.test();
    }
}
