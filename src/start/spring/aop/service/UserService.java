package start.spring.aop.service;

import org.springframework.stereotype.Service;
import start.spring.aop.dao.UserDao;

import javax.annotation.Resource;

/**
 * @auther: Meruem117
 */
@Service
public class UserService {
    @Resource
    private UserDao userDao;
}
