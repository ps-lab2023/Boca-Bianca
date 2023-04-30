package com.example.ProjectMagazinVar2.controller;

import com.example.ProjectMagazinVar2.Service.OrderService;
import com.example.ProjectMagazinVar2.Service.ProductService;
import com.example.ProjectMagazinVar2.model.Orderer;
import com.example.ProjectMagazinVar2.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/order")
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;


}
