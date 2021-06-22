package com.api.hustle.infraestructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pais2/")
public class product {
    @GetMapping("/product")
    List<String> all() {
        List<String> productList =  new ArrayList<>();
        productList.add("1");
        productList.add("2");
        productList.add("3");
        productList.add("4");
        productList.add("5");
        productList.add("6");
        return productList;
    }
}
