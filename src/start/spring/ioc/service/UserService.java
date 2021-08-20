package start.spring.ioc.service;

import start.spring.ioc.dao.UserDao;

/**
 * @auther: Meruem117
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void service() {
        System.out.println("service");
        userDao.dao();
    }
}
