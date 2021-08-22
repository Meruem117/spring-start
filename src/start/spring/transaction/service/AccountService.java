package start.spring.transaction.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import start.spring.transaction.dao.AccountDao;

import javax.annotation.Resource;

/**
 * @auther: Meruem117
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE, timeout = 5)
public class AccountService {
    @Resource
    private AccountDao accountDao;

    public void transMoney() {
        accountDao.reduceMoney();

        int bug = 10 / 0;

        accountDao.addMoney();
    }
}
