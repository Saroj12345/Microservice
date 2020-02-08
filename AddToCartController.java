package com.example.addtocart.AddToCart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/addtocart")
public class AddToCartController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getInfo/{info}")
    public String getCustomer(@PathVariable String info) {
        String url = "http//MICROSERVICE1/getcart/"+info;
        return restTemplate.getForObject(url,String.class);
    }
}
