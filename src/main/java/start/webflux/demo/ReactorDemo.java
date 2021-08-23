package start.webflux.demo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @auther: Meruem117
 */
public class ReactorDemo {
    public static void main(String[] args) {
        Flux.just(1, 2, 3, 4).subscribe(System.out::print);
        Mono.just(1).subscribe(System.out::println);

        Integer[] array = {1, 2, 3, 4};
        Flux.fromArray(array).subscribe(System.out::print);

        List<Integer> list = Arrays.asList(array);
        Flux.fromIterable(list).subscribe(System.out::print);

        Stream<Integer> stream = list.stream();
        Flux.fromStream(stream).subscribe(System.out::print);
    }
}
