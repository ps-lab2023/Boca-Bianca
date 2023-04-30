package com.example.ProjectMagazinVar2.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDTO {

    private int id;

    private String nameProduct;
    private int quantity;
    private int pretProdus;
    private String brand;
    private String images;
    private String gender;


}