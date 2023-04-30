package com.example.ProjectMagazinVar2.mapper;

import com.example.ProjectMagazinVar2.DTO.ProductDTO;
import com.example.ProjectMagazinVar2.model.Product;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductMapper {

    public static ProductDTO mapProductToDTO(Product product)
    {
        ProductDTO productDTO=new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setBrand(product.getBrand());
        productDTO.setQuantity(product.getQuantity());
        productDTO.setPretProdus(product.getPretProdus());
        productDTO.setNameProduct(product.getNameProduct());
        productDTO.setImages(product.getImages());
        return productDTO;
    }


    public static Product mapDTOToProduct(ProductDTO productDTO)
    {
        Product product=new Product();
        product.setId(Math.toIntExact(productDTO.getId()));
        product.setBrand(productDTO.getBrand());
        product.setQuantity(productDTO.getQuantity());
        product.setPretProdus(productDTO.getPretProdus());
        product.setNameProduct(productDTO.getNameProduct());
        product.setImages(productDTO.getImages());
        return product;
    }

}
