package BabyStat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:db.properties")
public class BabyStatApplication {

    public static void main(String[] args) {
        SpringApplication.run(BabyStatApplication.class, args);
    }

}
