package start.spring.ioc.service.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import start.spring.ioc.dao.annotation.BaseDao;

import javax.annotation.Resource;

/**
 * @auther: Meruem117
 */
@Service
public class BaseService {

    @Value(value = "base")
    private String value;

    // @Autowired
    // @Qualifier(value = "baseDaoImpl")
    // @Resource
    @Resource(name = "baseDaoImpl")
    private BaseDao baseDao;

    public void test() {
        System.out.println("Base service");
        System.out.println("Base value " + value);
        baseDao.test();
    }
}
