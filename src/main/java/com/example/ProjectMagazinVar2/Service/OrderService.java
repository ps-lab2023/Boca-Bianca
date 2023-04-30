package com.example.ProjectMagazinVar2.Service;

import com.example.ProjectMagazinVar2.model.Orderer;
import com.example.ProjectMagazinVar2.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface OrderService {
    void addingToOrder(Product product);

    void addOrder(Orderer orderer);
}
