package start.spring.jdbc.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import start.spring.jdbc.entity.User;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: Meruem117
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        String sql = "insert into user values(?, ?, ?)";
        Object[] args = {user.getId(), user.getName(), user.getPassword()};
        int res = jdbcTemplate.update(sql, args);
        System.out.println(res);
    }

    @Override
    public void update(User user) {
        String sql = "update user set name = ?, password = ? where id = ?";
        Object[] args = {user.getName(), user.getPassword(), user.getId()};
        int res = jdbcTemplate.update(sql, args);
        System.out.println(res);
    }

    @Override
    public void delete(int id) {
        String sql = "delete from user where id = ?";
        int res = jdbcTemplate.update(sql, id);
        System.out.println(res);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from user";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public User getUserById(int id) {
        String sql = "select * from user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
        return user;
    }

    @Override
    public List<User> getUserList() {
        String sql = "select * from user";
        List<User> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return list;
    }

    @Override
    public void batchAdd(List<Object[]> list) {
        String sql = "insert into user values(?, ?, ?)";
        int[] res = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(res));
    }

    @Override
    public void batchUpdate(List<Object[]> list) {
        String sql = "update user set name = ?, password = ? where id = ?";
        int[] res = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(res));
    }

    @Override
    public void batchDelete(List<Object[]> list) {
        String sql = "delete from user where id = ?";
        int[] res = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(res));
    }
}
