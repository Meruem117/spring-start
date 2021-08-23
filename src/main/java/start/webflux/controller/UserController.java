package start.webflux.controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import start.webflux.entity.User;
import start.webflux.service.UserService;

import javax.annotation.Resource;

/**
 * @auther: Meruem117
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/user/{id}")
    public Mono<User> getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/user/getUserList")
    public Flux<User> getUserList() {
        return userService.getUserList();
    }

    @PostMapping("/user/addUser")
    public Mono<Void> addUser(@RequestBody User user) {
        Mono<User> userMono = Mono.just(user);
        return userService.addUser(userMono);
    }
}
