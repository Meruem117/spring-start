package start.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import start.spring.config.SpringConfig;
import start.spring.service.annotation.BaseService;

/**
 * @auther: Meruem117
 */
public class ConfigTest {
    @Test
    public void TestConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        BaseService baseService = context.getBean("baseService", BaseService.class);
        baseService.test();
    }
}
