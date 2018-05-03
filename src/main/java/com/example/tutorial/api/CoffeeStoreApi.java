package com.example.tutorial.api;

import com.example.tutorial.model.CoffeeStore;
import com.example.tutorial.service.CoffeeStoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoffeeStoreApi {

    private CoffeeStoreService coffeeStoreService;

    public CoffeeStoreApi(CoffeeStoreService coffeeStoreService) {
        this.coffeeStoreService = coffeeStoreService;
    }

    @GetMapping("api/coffeestores")
    public List<CoffeeStore> retrieveAllCoffeeStores() {
        return coffeeStoreService.getAllCoffeeStores();
    }

}
