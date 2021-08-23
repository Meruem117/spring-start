package start.mybatis.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import start.mybatis.mapper.UserMapper;
import start.mybatis.pojo.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther: Meruem117
 */
@Service
@Transactional
public class UserService {
    @Resource
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
