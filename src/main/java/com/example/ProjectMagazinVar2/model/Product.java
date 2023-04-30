package com.example.ProjectMagazinVar2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nameProduct;
    private int quantity;
    private int pretProdus;
    private String brand;
    private String images;
    private String gender;




    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private User user;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Orderer ordering;



    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", quantity='" + quantity + '\'' +
                ", pretProdus='" + pretProdus + '\'' +
                ", brand='" + brand + '\'' +
                '}'+"\n";
    }
}
