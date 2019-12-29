package com.pizza.app;

import com.pizza.app.domain.Pizza;
import com.pizza.app.domain.PizzaInventoryRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

    @Bean
    public ApplicationRunner run(PizzaInventoryRepository pizzaInventoryRepository) {
        return args -> {
            pizzaInventoryRepository.save(new Pizza(null, "Margherita"));
        };
    }

}
