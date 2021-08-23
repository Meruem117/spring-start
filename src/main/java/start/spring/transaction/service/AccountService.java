package start.spring.transaction.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import start.spring.transaction.dao.AccountDao;
import start.spring.transaction.entity.Account;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther: Meruem117
 */
@Service
public class AccountService {
    @Resource
    private AccountDao accountDao;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE, timeout = 5)
    public void transMoney() {
        accountDao.reduceMoney();

        int bug = 10 / 0;

        accountDao.addMoney();
    }

    public List<Account> getAccounts() {
        return accountDao.getAccounts();
    }
}
