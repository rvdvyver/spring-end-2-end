package com.example.tutorial.service;

import com.example.tutorial.model.Coffee;
import com.example.tutorial.model.CoffeeStore;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;

@Service
public class CoffeeStoreService {

    public CoffeeStore getCoffeeStoreById(Long id) {
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.setStoreName("StarDucks");

        Coffee coffee = new Coffee();
        coffee.setId(1L);
        coffee.setCoffeeName("Cup-of-Joe");
        coffee.setDescription("Just coffee in a cup - Nothing more - Nothing less");
        coffee.setPrice(new BigDecimal(3.5));

        coffeeStore.setCoffeeList(Arrays.asList(coffee));
        return coffeeStore;
    }
}
