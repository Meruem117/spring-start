package start.spring.transaction.dao;

import start.spring.transaction.entity.Account;

import java.util.List;

/**
 * @auther: Meruem117
 */
public interface AccountDao {
    void addMoney();

    void reduceMoney();

    List<Account> getAccounts();
}
