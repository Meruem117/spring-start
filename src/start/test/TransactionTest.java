package start.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import start.spring.transaction.config.TxConfig;
import start.spring.transaction.service.AccountService;

/**
 * @auther: Meruem117
 */
public class TransactionTest {
    @Test
    public void testTransaction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.transMoney();
    }

    @Test
    public void testTransactionConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.transMoney();
    }
}
