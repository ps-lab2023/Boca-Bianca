package com.example.ProjectMagazinVar2.Service.ServiceImplementation;

import com.example.ProjectMagazinVar2.DTO.ProductDTO;
import com.example.ProjectMagazinVar2.Repository.ProductRepository;
import com.example.ProjectMagazinVar2.Service.ProductService;
import com.example.ProjectMagazinVar2.mapper.ProductMapper;
import com.example.ProjectMagazinVar2.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class ProductServiceImplementation implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDTO> findAllProducts()
    {
        List<Product> productList= (List<Product>) productRepository.findAll();
        List<ProductDTO> productDTO=new ArrayList<>();
        for(Product prod :productList)
        {
            productDTO.add(ProductMapper.mapProductToDTO(prod));
        }
        return productDTO;
    }

    public ProductDTO findProductById(Long id)
    {
        return ProductMapper.mapProductToDTO((productRepository.findAllById(Math.toIntExact(id))));
    }


    @Override
    public Product addProduct(Product Product1)
    {
        return productRepository.save(Product1);
    }



    @Override
    public void deleteProductById(Long id)
    {
        productRepository.deleteById(id);
    }


    @Override
    public ProductDTO updateProductNume(Long id, String nume) {
        Product updateProduct = productRepository.findById((long)id).get();
        updateProduct.setNameProduct(nume);
        productRepository.save(updateProduct);
        ProductDTO productDTO=ProductMapper.mapProductToDTO(updateProduct);
        return productDTO;
    }


    @Override
    public ProductDTO updateProductCantitate(Long id, int pret) {
        Product updateProduct = productRepository.findById((long)id).get();
        updateProduct.setQuantity(pret);
        productRepository.save(updateProduct);
        ProductDTO productDTO=ProductMapper.mapProductToDTO(updateProduct);
        return productDTO;
    }

    @Override
    public ProductDTO updateProductPret(Long id, int cantitate) {
        Product updateProduct = productRepository.findById((long)id).get();
        updateProduct.setPretProdus(cantitate);
        productRepository.save(updateProduct);
        ProductDTO productDTO=ProductMapper.mapProductToDTO(updateProduct);
        return productDTO;
    }
    @Override
    public ProductDTO updateProductMarca(Long id, String marca ) {
        Product updateProduct = productRepository.findById((long)id).get();
        updateProduct.setBrand(marca);
        productRepository.save(updateProduct);
        ProductDTO productDTO=ProductMapper.mapProductToDTO(updateProduct);
        return productDTO;
    }

    @Override
    public List<Product> comparaDupaPretCrescator()
    {

        List<Product> productList = (List<Product>) productRepository.findAll();
        Stream<Product> productStream = productList.stream().sorted(Comparator.comparingInt(Product::getPretProdus));
        return productStream.collect(Collectors.toList());

    }

    @Override
    public List<Product> comparaDupaPret() {
        List<Product> productList = (List<Product>) productRepository.findAll();
        Stream<Product> productStream = productList.stream().sorted(Comparator.comparingInt(Product::getPretProdus).reversed());
        return productStream.collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> findGenderKids(String gender) {
        List<Product> listaProduse = (List<Product>) productRepository.findAll();
        List<ProductDTO> listaGender=new ArrayList<ProductDTO>();
        for (Product product : listaProduse) {

            if(product.getGender().equals(gender)){
                listaGender.add(ProductMapper.mapProductToDTO(product));
            }

        }
        return listaGender;


    }

    //////asta nu merge- ma mai gandesc la ea
    @Override
    public List<Product> ordonareAlfabetica() {
        List<Product> productList = (List<Product>) productRepository.findAll();
        Product[] productArray = productList.toArray(new Product[0]);
        Arrays.sort(productArray, Comparator.comparing(Product::getNameProduct));
        return Arrays.asList(productArray);
    }
    @Override
    public Optional<Product> findById(Long id)
    {
        return productRepository.findById(id);
    }

    @Override
    public ProductDTO findByNameProduct(String name) {
        List<Product> productList = (List<Product>) productRepository.findAll();
        for (Product product : productList) {
            if (product.getNameProduct().equalsIgnoreCase(name)) {
                return ProductMapper.mapProductToDTO(product);
            }
        }
        return null;
    }

}