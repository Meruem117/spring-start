package start.spring.jdbc.dao;

import start.spring.jdbc.entity.User;

import java.util.List;

/**
 * @auther: Meruem117
 */
public interface UserDao {
    void add(User user);

    void update(User user);

    void delete(int id);

    int selectCount();

    User getUserById(int id);

    List<User> getUserList();

    void batchAdd(List<Object[]> list);

    void batchUpdate(List<Object[]> list);

    void batchDelete(List<Object[]> list);
}
