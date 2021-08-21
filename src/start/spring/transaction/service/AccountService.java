package start.spring.transaction.service;

import org.springframework.stereotype.Service;
import start.spring.transaction.dao.AccountDao;

import javax.annotation.Resource;

/**
 * @auther: Meruem117
 */
@Service
public class AccountService {
    @Resource
    private AccountDao accountDao;

    public void transMoney() {
        accountDao.reduceMoney();

        accountDao.addMoney();
    }
}
