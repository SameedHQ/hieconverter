package hieconverterapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
//		SpringApplication.run(new Class[]{hieconverterapi.Application.class, ResponseGetterDCM.class}, args);
        SpringApplication.run(Application.class);
    }
}
