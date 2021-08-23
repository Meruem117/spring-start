package start.spring.ioc.bean.school;

/**
 * @auther: Meruem117
 */
public class Student {
    private Integer id;
    private String name;
    private Teacher teacher;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void test() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(teacher);
    }
}
