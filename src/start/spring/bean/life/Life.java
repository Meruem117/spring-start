package start.spring.bean.life;

/**
 * @auther: Meruem117
 */
public class Life {
    private String name;

    public Life() {
        System.out.println(1);
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(2);
    }

    public void init() {
        System.out.println(3);
    }

    public void destroy() {
        System.out.println(5);
    }
}
