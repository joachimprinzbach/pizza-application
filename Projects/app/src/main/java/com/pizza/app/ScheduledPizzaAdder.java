package com.pizza.app;

import com.pizza.app.domain.Pizza;
import com.pizza.app.domain.PizzaInventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ScheduledPizzaAdder {

    private final PizzaInventoryRepository pizzaInventoryRepository;

    @Scheduled(fixedRate = 5000)
    public void addSomePizza() {
        pizzaInventoryRepository.save(new Pizza(null, "Salami"));
    }
}
