package start.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import start.spring.aop.annotation.User;
import start.spring.aop.xml.Book;

/**
 * @auther: Meruem117
 */
public class AOPTest {
    @Test
    public void TestAnnotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        User user = context.getBean("user", User.class);
        user.use();
    }

    @Test
    public void TestXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
