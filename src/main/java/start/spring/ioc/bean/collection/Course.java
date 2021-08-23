package start.spring.ioc.bean.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @auther: Meruem117
 */
public class Course {
    private String[] courses;
    private List<String> list;
    private Map<String, String> map;
    private Set<String> set;
    private List<Lesson> lessons;
    private List<String> utils;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public void setUtils(List<String> utils) {
        this.utils = utils;
    }

    public void test() {
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
        System.out.println(lessons);
        System.out.println(utils);
    }
}
