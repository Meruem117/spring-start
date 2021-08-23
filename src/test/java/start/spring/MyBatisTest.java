package start.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import start.mybatis.mapper.UserMapper;
import start.mybatis.pojo.User;
import start.mybatis.service.UserService;

import java.util.List;

/**
 * @auther: Meruem117
 */
public class MyBatisTest {

    @Test
    public void testGetUserList() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mybatis-spring.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        List<User> list = mapper.getUserList();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void testGetUserById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mybatis-spring.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void testGetUserByIdService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mybatis-spring.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = userService.getUserById(1);
        System.out.println(user);
    }
}
