package start.spring.ioc.bean.factory;

import org.springframework.beans.factory.FactoryBean;
import start.spring.ioc.bean.User;

/**
 * @auther: Meruem117
 */
public class Factory implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setName("John");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
