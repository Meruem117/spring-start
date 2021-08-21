package start.spring.aop.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @auther: Meruem117
 */
@Repository
public class UserDaoImpl {
    @Resource
    private JdbcTemplate jdbcTemplate;
}
