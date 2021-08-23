package start.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import start.spring.jdbc.entity.User;
import start.spring.jdbc.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: Meruem117
 */
public class JdbcTest {
    @Test
    public void addTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        UserService userService = context.getBean("userService", UserService.class);

        User user = new User();
        user.setId(5);
        user.setName("BB");
        user.setPassword("123456");

        userService.addUser(user);
    }

    @Test
    public void updateTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        UserService userService = context.getBean("userService", UserService.class);

        User user = new User();
        user.setId(5);
        user.setName("CC");
        user.setPassword("123456");

        userService.updateUser(user);
    }

    @Test
    public void deleteTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        UserService userService = context.getBean("userService", UserService.class);

        userService.deleteUser(5);
    }

    @Test
    public void selectCountTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        UserService userService = context.getBean("userService", UserService.class);

        int count = userService.selectCount();
        System.out.println(count);
    }

    @Test
    public void getUserByIdTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        UserService userService = context.getBean("userService", UserService.class);

        User user = userService.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void getUserListTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        UserService userService = context.getBean("userService", UserService.class);

        List<User> list = userService.getUserList();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void batchAddTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        UserService userService = context.getBean("userService", UserService.class);

        List<Object[]> list = new ArrayList<>();
        Object[] user1 = {4, "four", "123456"};
        Object[] user2 = {5, "five", "123456"};
        list.add(user1);
        list.add(user2);

        userService.batchAdd(list);
    }

    @Test
    public void batchUpdateTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        UserService userService = context.getBean("userService", UserService.class);

        List<Object[]> list = new ArrayList<>();
        Object[] user1 = {"four4", "123456", 4};
        Object[] user2 = {"five5", "123456", 5};
        list.add(user1);
        list.add(user2);

        userService.batchUpdate(list);
    }

    @Test
    public void batchDeleteTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        UserService userService = context.getBean("userService", UserService.class);

        List<Object[]> list = new ArrayList<>();
        Object[] id1 = {4};
        Object[] id2 = {5};
        list.add(id1);
        list.add(id2);

        userService.batchDelete(list);
    }
}
