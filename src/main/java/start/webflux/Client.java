package start.webflux;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import start.webflux.entity.User;

/**
 * @auther: Meruem117
 */
public class Client {
    public static void main(String[] args) {
        WebClient webClient = WebClient.create("http://127.0.0.1:8085");
        String id = "1";
        User user = webClient.get()
                .uri("/user/{id}", id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(User.class)
                .block();
        System.out.println(user);

        Flux<User> users = webClient.get()
                .uri("/users")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(User.class);
        users.map(User::getName).buffer().doOnNext(System.out::println).blockFirst();
    }
}
