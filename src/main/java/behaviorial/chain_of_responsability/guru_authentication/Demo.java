package behaviorial.chain_of_responsability.guru_authentication;

import behaviorial.chain_of_responsability.guru_authentication.middleware.Middleware;
import behaviorial.chain_of_responsability.guru_authentication.middleware.RoleCheckMiddleware;
import behaviorial.chain_of_responsability.guru_authentication.middleware.ThrottlingMiddleware;
import behaviorial.chain_of_responsability.guru_authentication.middleware.UserExistsMiddleware;
import behaviorial.chain_of_responsability.guru_authentication.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.println("Enter email: ");
            String email = reader.readLine();
            System.out.println("Enter password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
