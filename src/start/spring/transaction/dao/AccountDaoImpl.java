package start.spring.transaction.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @auther: Meruem117
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update account set money = money + ? where id = ?";
        jdbcTemplate.update(sql, 1000, 1);
    }

    @Override
    public void reduceMoney() {
        String sql = "update account set money = money - ? where id = ?";
        jdbcTemplate.update(sql, 1000, 2);
    }
}
