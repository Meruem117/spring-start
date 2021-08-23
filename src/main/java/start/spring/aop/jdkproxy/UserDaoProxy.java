package start.spring.aop.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @auther: Meruem117
 */
public class UserDaoProxy implements InvocationHandler {

    private Object object;

    public UserDaoProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before " + method.getName() + " 参数 " + Arrays.toString(args));
        Object res = method.invoke(object, args);
        System.out.println("after " + object);
        return res;
    }
}