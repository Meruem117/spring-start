package start.spring.aop.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * @auther: Meruem117
 */
public class JDKProxy {

    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(1, 2);
        System.out.println("result " + result);
    }
}
