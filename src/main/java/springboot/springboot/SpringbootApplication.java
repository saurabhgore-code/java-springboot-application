package springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {
// @RequestMapping("/")
public String home() {
    return "Dockerizing Spring Boot Application";
}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
