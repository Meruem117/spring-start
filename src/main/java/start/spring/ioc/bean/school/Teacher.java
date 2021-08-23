package start.spring.ioc.bean.school;

/**
 * @auther: Meruem117
 */
public class Teacher {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
