package com.example.tutorial.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class CoffeeController {
    
    @GetMapping("coffee/menu")
    public String showCoffees(Model model) {
        model.addAttribute("coffeeStoreName","Star-Ducks");
        return "menu";
    }
    
}
