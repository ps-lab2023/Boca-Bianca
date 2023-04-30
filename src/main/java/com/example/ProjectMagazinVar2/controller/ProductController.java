package com.example.ProjectMagazinVar2.controller;

import com.example.ProjectMagazinVar2.DTO.ProductDTO;
import com.example.ProjectMagazinVar2.Service.ProductService;
import com.example.ProjectMagazinVar2.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/product")
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService)
    {
        this.productService=productService;
    }


    @GetMapping("/findAll")
    public ResponseEntity<List<ProductDTO>> getAllProducts () {
        List<ProductDTO> products = productService.findAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<ProductDTO> getProductById (@RequestParam("id") Integer id) {
        ProductDTO product =productService.findAllProducts().get(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    @GetMapping("/OrderCrescator")
    public ResponseEntity<List<Product>> sorteazaCrescator()
    {
        List<Product> productListSorted=productService.comparaDupaPretCrescator();
        return new ResponseEntity<>(productListSorted, HttpStatus.OK);
    }
    @GetMapping("/OrderDescrescator")
    public ResponseEntity<List<Product>> sorteazaDescrescator()
    {
        List<Product> productListSorted=productService.comparaDupaPret();
        return new ResponseEntity<>(productListSorted, HttpStatus.OK);
    }
    @GetMapping("/findByName")
    public ResponseEntity<ProductDTO> returnProductAlfabetic(@RequestParam String nume)
    {
        return new ResponseEntity<>(productService.findByNameProduct(nume), HttpStatus.OK);
    }

    @PutMapping("/update/name")
    public ResponseEntity<ProductDTO> updateProductName(@RequestParam Long id, @RequestParam String nume) {
        ProductDTO product1 = productService.updateProductNume(id,nume);
        return new ResponseEntity<>(product1, HttpStatus.OK);
    }

    @DeleteMapping("/deleteById")
    public ResponseEntity<?> deleteProductById(@RequestParam("id") Long id) {
        productService.deleteProductById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



    @GetMapping("/findGender")
    public ResponseEntity<List<ProductDTO>> findGenderOfTheProducts(@RequestParam String gender)
    {
        List<ProductDTO> findGender=productService.findGenderKids(gender);
        return new ResponseEntity<>(findGender,HttpStatus.OK);
    }


}
