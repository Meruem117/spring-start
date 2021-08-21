package start.spring.aop.jdkproxy;

/**
 * @auther: Meruem117
 */
public class UserDaoImpl implements UserDao {

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
