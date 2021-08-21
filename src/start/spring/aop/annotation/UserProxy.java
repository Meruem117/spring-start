package start.spring.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @auther: Meruem117
 */
@Component
@Aspect
@Order(2)
public class UserProxy {

    @Pointcut(value = "execution(* start.spring.aop.annotation.User.use())")
    public void point() {
    }

    @Before(value = "point()")
    public void before() {
        System.out.println("before");
    }

    @After(value = "point()")
    public void after() {
        System.out.println("after");
    }

    @AfterReturning(value = "point()")
    public void afterReturning() {
        System.out.println("afterReturning");
    }

    @AfterThrowing(value = "point()")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

    @Around(value = "point()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before around");
        proceedingJoinPoint.proceed();
        System.out.println("after around");
    }
}
