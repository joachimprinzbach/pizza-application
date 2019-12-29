package com.pizza.app.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PizzaInventoryService {

    private final PizzaInventoryRepository pizzaInventoryRepository;

    public List<Pizza> getAll() {
        return pizzaInventoryRepository.findAll();
    }

}
