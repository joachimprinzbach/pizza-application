package com.pizza.app.application;

import com.pizza.app.domain.Pizza;
import com.pizza.app.domain.PizzaInventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/api/inventory")
@RequiredArgsConstructor
public class PizzaInventoryRestController {

    private final PizzaInventoryService pizzaInventoryService;

    @GetMapping
    public List<PizzaDto> getAllPizzas() {
        List<Pizza> allPizzas = pizzaInventoryService.getAll();
        return allPizzas.
                stream()
                .map(pizza -> new PizzaDto(pizza.getName()))
                .collect(Collectors.toList());
    }
}
