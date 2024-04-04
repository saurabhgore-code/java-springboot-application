
package springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class SpringbootApplication {
 @RequestMapping("/")
public String home() {
    return "Dockerizing Spring Boot Application";
}
 @RequestMapping("/home")
public String homepage() {
    return "<h1> This is my spring boot application</h1>";
}
 @RequestMapping("/login")
public String login() {
    return "<h1>Welcome to DevOps<h1>";
}
 @RequestMapping("/logout")
public String logout() {
    return "<h1>Have a great day<h1>";
}
        public static void main(String[] args) {
                SpringApplication.run(SpringbootApplication.class, args);
        }

}
