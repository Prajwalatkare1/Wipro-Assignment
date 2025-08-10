package com.example.restaurantproducer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurantproducer.model.Restaurant;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return List.of(
            new Restaurant(1, "Taj Hotel", "Mumbai"),
            new Restaurant(2, "Oberoi", "Delhi")
        );
    }
}

