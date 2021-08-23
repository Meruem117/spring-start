package start.webflux.service;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import start.webflux.entity.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: Meruem117
 */
@Repository
public class UserServiceImpl implements UserService {

    private final Map<Integer, User> users = new HashMap<>();

    public UserServiceImpl() {
        this.users.put(1, new User(1, "John", 35));
        this.users.put(2, new User(2, "Finch", 40));
        this.users.put(3, new User(3, "Carter", 32));
    }

    @Override
    public Mono<User> getUserById(int id) {
        return Mono.justOrEmpty(this.users.get(id));
    }

    @Override
    public Flux<User> getUserList() {
        return Flux.fromIterable(this.users.values());
    }

    @Override
    public Mono<Void> addUser(Mono<User> user) {
        return user.doOnNext(newUser -> {
            int id = users.size() + 1;
            users.put(id, newUser);
        }).thenEmpty(Mono.empty());
    }
}
