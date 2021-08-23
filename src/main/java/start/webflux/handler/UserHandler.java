package start.webflux.handler;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import start.webflux.entity.User;
import start.webflux.service.UserService;

import static org.springframework.web.reactive.function.BodyInserters.fromValue;

/**
 * @auther: Meruem117
 */
public class UserHandler {

    private final UserService userService;

    public UserHandler(UserService userService) {
        this.userService = userService;
    }

    public Mono<ServerResponse> getUserById(ServerRequest request) {
        int id = Integer.parseInt(request.pathVariable("id"));
        // 空值处理
        Mono<ServerResponse> notFound = ServerResponse.notFound().build();
        Mono<User> userMono = this.userService.getUserById(id);
        // 把userMono转换为流返回
        return userMono.flatMap(user -> ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromValue(user)))
                .switchIfEmpty(notFound);
    }

    public Mono<ServerResponse> getUserList(ServerRequest request) {
        Flux<User> users = this.userService.getUserList();
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(users, User.class);
    }

    public Mono<ServerResponse> addUser(ServerRequest request) {
        Mono<User> userMono = request.bodyToMono(User.class);
        return ServerResponse.ok()
                .build(this.userService.addUser(userMono));
    }
}
