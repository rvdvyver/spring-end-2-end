package com.example.tutorial.web;

import com.example.tutorial.model.CoffeeStore;
import com.example.tutorial.service.CoffeeStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class CoffeeController {

    private CoffeeStoreService coffeeStoreService;

    @Autowired
    public CoffeeController(CoffeeStoreService coffeeStoreService) {
        this.coffeeStoreService = coffeeStoreService;
    }

    @GetMapping("coffee/menu")
    public String showCoffees(Model model) {
        CoffeeStore store = coffeeStoreService.getCoffeeStoreById(0L);
        model.addAttribute("coffeeStoreName",store.getStoreName());
        model.addAttribute("coffees", store.getCoffeeList());
        return "menu";
    }
    
}
