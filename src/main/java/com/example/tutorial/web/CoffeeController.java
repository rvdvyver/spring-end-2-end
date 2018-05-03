package com.example.tutorial.web;

import com.example.tutorial.model.CoffeeStore;
import com.example.tutorial.service.CoffeeStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CoffeeController {

    private CoffeeStoreService coffeeStoreService;

    @Autowired
    public CoffeeController(CoffeeStoreService coffeeStoreService) {
        this.coffeeStoreService = coffeeStoreService;
    }

    @GetMapping("coffee/{id}/menu")
    public String showMenu(Model model, @PathVariable("id") Long id) {
        CoffeeStore store = coffeeStoreService.getCoffeeStoreById(id);

        model.addAttribute("coffeeStoreName", store.getStoreName());
        model.addAttribute("coffees", store.getCoffeeList());

        return "menu";
    }

    @GetMapping("coffee")
    public String showAllStores(Model model) {
        List<CoffeeStore> stores = coffeeStoreService.getAllCoffeeStores();

        model.addAttribute("coffeeStores", stores);

        return "all_stores";
    }

    @GetMapping("coffee/addstore")
    public String addStorePage() {
        return "add_store";
    }

    @PostMapping("coffee/addstore")
    public String addStore(@ModelAttribute CoffeeStoreDto storeDto) {
        coffeeStoreService.saveCoffeeStore(storeDto.getName());
        return "redirect:/coffee";
    }

    @GetMapping("coffee/{storeId}/addCoffee")
    public String addCoffeePage(@PathVariable("storeId") Long storeId, Model model) {
        CoffeeStore coffeeStoreById = coffeeStoreService.getCoffeeStoreById(storeId);
        model.addAttribute("coffeeStoreName", coffeeStoreById.getStoreName());
        model.addAttribute("storeId", coffeeStoreById.getId());
        return "add_coffee";
    }

    @PostMapping("coffee/{storeId}/addCoffee")
    public String addCoffeeToStore(@ModelAttribute CoffeeDto coffeeDto, @PathVariable("storeId") Long storeId) {
        coffeeStoreService.saveCoffee(storeId, coffeeDto);
        return "redirect:/coffee";
    }
}
