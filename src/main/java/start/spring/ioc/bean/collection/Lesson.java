package start.spring.ioc.bean.collection;

/**
 * @auther: Meruem117
 */
public class Lesson {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                '}';
    }
}
