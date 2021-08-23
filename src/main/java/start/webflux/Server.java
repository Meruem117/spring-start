package start.webflux;

import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.netty.http.server.HttpServer;
import start.webflux.handler.UserHandler;
import start.webflux.service.UserService;
import start.webflux.service.UserServiceImpl;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.toHttpHandler;

/**
 * @auther: Meruem117
 */
public class Server {

    public static void main(String[] args) throws Exception {
        Server server = new Server();
        server.createReactorServer();
        System.out.println("Enter to exit...");
        System.in.read();
    }

    public RouterFunction<ServerResponse> routerFunction() {
        UserService userService = new UserServiceImpl();
        UserHandler userHandler = new UserHandler(userService);
        return RouterFunctions.route(
                GET("/user/{id}").and(accept(APPLICATION_JSON)), userHandler::getUserById)
                .andRoute(GET("/users").and(accept(APPLICATION_JSON)), userHandler::getUserList);
    }

    public void createReactorServer() {
        RouterFunction<ServerResponse> route = routerFunction();
        HttpHandler httpHandler = toHttpHandler(route);
        ReactorHttpHandlerAdapter adapter = new ReactorHttpHandlerAdapter(httpHandler);
        HttpServer httpServer = HttpServer.create().host("localhost").port(8085);
        httpServer.handle(adapter).bindNow();
    }
}
