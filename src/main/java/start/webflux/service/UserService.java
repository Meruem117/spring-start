package start.webflux.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import start.webflux.entity.User;

/**
 * @auther: Meruem117
 */
public interface UserService {
    Mono<User> getUserById(int id);

    Flux<User> getUserList();

    Mono<Void> addUser(Mono<User> user);
}
