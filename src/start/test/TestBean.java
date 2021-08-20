package start.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import start.spring.bean.User;
import start.spring.bean.base.User1;
import start.spring.bean.base.User2;
import start.spring.bean.base.User3;
import start.spring.bean.collection.Course;
import start.spring.bean.factory.Factory;
import start.spring.bean.school.Student;
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

    @org.junit.Test
    public void TestCollection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Course course = context.getBean("course", Course.class);
        course.test();
    }

    @org.junit.Test
    public void TestUtil() {
        ApplicationContext context = new ClassPathXmlApplicationContext("utils.xml");
        Course course = context.getBean("courses", Course.class);
        course.test();
    }

    @org.junit.Test
    public void TestFactory() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("factory", User.class);
        System.out.println(user);
    }
}
