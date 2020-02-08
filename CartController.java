package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {


    @GetMapping("/getcart/{cartid}")
    public String getCartDetails(@PathVariable String cartid) {
        return "Cart fecthed Successfully for " + cartid;
    }
}
