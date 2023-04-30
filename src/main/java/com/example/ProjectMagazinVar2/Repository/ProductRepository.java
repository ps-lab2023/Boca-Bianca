package com.example.ProjectMagazinVar2.Repository;

import com.example.ProjectMagazinVar2.DTO.ProductDTO;
import com.example.ProjectMagazinVar2.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findAllById(int id);
    ProductDTO findById(int id);

    ProductDTO findByNameProduct(String nume);


}
