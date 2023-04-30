package com.example.ProjectMagazinVar2.Service;

import com.example.ProjectMagazinVar2.DTO.ProductDTO;
import com.example.ProjectMagazinVar2.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ProductService {
    List<ProductDTO> findAllProducts();

    Product addProduct(Product Product1);

    void deleteProductById(Long id);

    ProductDTO updateProductNume(Long id, String nume);

    ProductDTO updateProductCantitate(Long id, int pret);

    ProductDTO updateProductPret(Long id, int pret);

    ProductDTO updateProductMarca(Long id, String marca);

    List<Product> comparaDupaPretCrescator();

    List<Product> comparaDupaPret();

    List<ProductDTO> findGenderKids(String gender);

    List<Product> ordonareAlfabetica();

    Optional<Product> findById(Long id);

    ProductDTO findByNameProduct(String name);

}