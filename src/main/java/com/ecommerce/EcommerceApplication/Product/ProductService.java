package com.ecommerce.EcommerceApplication.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel>  getAllProducts(){
        return  productRepository.findAll();
    }

    public ProductModel getParticularProduct(String id){
        return productRepository.findById(id).orElse(null);
    }

    public ProductModel createProduct(ProductModel product){
        return productRepository.save(product);
    }

    public void deleteProduct(String id){
        productRepository.deleteById(id);
    }
}
