package start.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @auther: Meruem117
 */
@Component
@Aspect
@Order(1)
public class UserProxy2 {
    @Before(value = "execution(* start.spring.aop.annotation.User.use())")
    public void before() {
        System.out.println("before2");
    }
}
