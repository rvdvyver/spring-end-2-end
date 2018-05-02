package com.example.tutorial.service;

import com.example.tutorial.model.Coffee;
import com.example.tutorial.model.CoffeeStore;
import com.example.tutorial.repository.CoffeeStoreRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.Arrays;

@Service
public class CoffeeStoreService {

    private CoffeeStoreRepository coffeeStoreRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(CoffeeStoreService.class);

    @Autowired
    public CoffeeStoreService(CoffeeStoreRepository coffeeStoreRepository) {
        this.coffeeStoreRepository = coffeeStoreRepository;
    }

    public CoffeeStore getCoffeeStoreById(Long id) {
        return coffeeStoreRepository.findById(id).get();
    }

    @PostConstruct
    public void populateDatabase() {
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.setStoreName("StarDucks");

        Coffee coffee = new Coffee();
        coffee.setCoffeeName("Cup-of-Joe");
        coffee.setDescription("Just coffee in a cup - Nothing more - Nothing less");
        coffee.setPrice(new BigDecimal(3.5));

        coffeeStore.setCoffeeList(Arrays.asList(coffee));

        coffeeStoreRepository.save(coffeeStore);

        LOGGER.info(coffeeStore.getStoreName() + " 's id is " + coffeeStore.getId());
    }
}
