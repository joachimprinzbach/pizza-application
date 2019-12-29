package com.pizza.app.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaInventoryRepository extends JpaRepository<Pizza, Integer> {

}
