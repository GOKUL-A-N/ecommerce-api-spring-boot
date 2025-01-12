package com.ecommerce.EcommerceApplication.Cart;

import com.ecommerce.EcommerceApplication.Product.ProductModel;
import com.ecommerce.EcommerceApplication.Product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductRepository productRepository;

    public CartModel getCart(String id){
        return cartRepository.findById(id).orElse(null);
    }

    public CartModel createCart(CartModel cart){
        return cartRepository.save(cart);
    }

    public CartModel addItemToCart(String id,String productId){
        CartModel cart = cartRepository.findById(id).orElse(null);
        ProductModel product = productRepository.findById(productId).orElse(null);
        if(cart == null || product == null){
            return null;
        }
        cart.addProduct(product);
        return cart;
    }
}
