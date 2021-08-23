package start.spring.ioc.bean.annotation;

import org.springframework.stereotype.Component;

/**
 * @auther: Meruem117
 */
@Component(value = "base")
public class Base {
    public void test() {
        System.out.println("base");
    }
}
