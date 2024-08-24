package ${package}.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "${package}")
public class ${entity}Configuration {

    public static void main(String[] args) {
        SpringApplication.run(${entity}Configuration.class, args);
    }
}