package start.spring.jdbc.service;

import org.springframework.stereotype.Service;
import start.spring.jdbc.dao.UserDao;
import start.spring.jdbc.entity.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther: Meruem117
 */
@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public void addUser(User user) {
        userDao.add(user);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public void deleteUser(int id) {
        userDao.delete(id);
    }

    public int selectCount() {
        return userDao.selectCount();
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    public List<User> getUserList() {
        return userDao.getUserList();
    }

    public void batchAdd(List<Object[]> list) {
        userDao.batchAdd(list);
    }

    public void batchUpdate(List<Object[]> list) {
        userDao.batchUpdate(list);
    }

    public void batchDelete(List<Object[]> list) {
        userDao.batchDelete(list);
    }
}
