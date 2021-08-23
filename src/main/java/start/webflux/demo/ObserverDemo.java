package start.webflux.demo;

import java.util.Observable;

/**
 * @auther: Meruem117
 */
public class ObserverDemo extends Observable {
    public static void main(String[] args) {
        ObserverDemo observer = new ObserverDemo();

        observer.addObserver((ob, arg) -> {
            System.out.println("changed");
        });

        observer.addObserver((ob, arg) -> {
            System.out.println("get notification");
        });

        observer.setChanged();
        observer.notifyObservers();
    }
}
