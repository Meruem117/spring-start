package start.spring.ioc.dao.annotation;

import org.springframework.stereotype.Repository;

/**
 * @auther: Meruem117
 */
@Repository
public class BaseDaoImpl implements BaseDao {

    @Override
    public void test() {
        System.out.println("Base dao");
    }
}
