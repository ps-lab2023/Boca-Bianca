package com.example.ProjectMagazinVar2.Service.ServiceImplementation;

import com.example.ProjectMagazinVar2.Repository.OrderRepository;
import com.example.ProjectMagazinVar2.Service.OrderService;
import com.example.ProjectMagazinVar2.model.Orderer;
import com.example.ProjectMagazinVar2.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImplementation implements OrderService {
    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void addingToOrder(Product product) {
        List<Product> comanda=new ArrayList<>() {};
        comanda.add(product);
    }

    @Override
    public void addOrder(Orderer orderer)
    {
        orderRepository.save(orderer);
    }

}
