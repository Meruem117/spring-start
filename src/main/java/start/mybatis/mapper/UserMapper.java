package start.mybatis.mapper;

import start.mybatis.pojo.User;

import java.util.List;

/**
 * @auther: Meruem117
 */
public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);
}
