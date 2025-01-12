package com.ecommerce.EcommerceApplication.Cart;

import com.ecommerce.EcommerceApplication.Product.ProductModel;
import com.ecommerce.EcommerceApplication.Product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductRepository productRepository;

    public CartModel createCart(){
        CartModel cart = new CartModel();
        return cartRepository.save(cart);
    }

    public CartModel addItemToCart(String cartId,String productId,int quantity){
        Optional<CartModel> optionalCart = cartRepository.findById(cartId);
        Optional<ProductModel> optionalProduct = productRepository.findById(productId);

        if(optionalCart.isEmpty()){
            throw new RuntimeException("Cart not found");
        }

        if(optionalProduct.isEmpty()){
            throw new RuntimeException("Product not found");
        }

        CartModel cart = optionalCart.get();
        ProductModel product = optionalProduct.get();

        CartItems existingItem = cart.getItems().stream()
                .filter(item -> item.getProduct().getId().equals(productId))
                .findFirst()
                .orElse(null);

        if(existingItem != null){
            existingItem.setQuantity(existingItem.getQuantity()+quantity);
        }else{
            CartItems newItem = new CartItems();
            newItem.setProduct(product);
            newItem.setQuantity(quantity);
            cart.getItems().add(newItem);
        }

        double totalPrice = cart.getItems().stream()
                .mapToDouble(item -> item.getProduct().getPrice() * item.getQuantity())
                .sum();

        cart.setTotalPrice(totalPrice);

        return cartRepository.save(cart);

    }

    public CartModel getCart(String cartId){
        return cartRepository.findById(cartId)
                .orElseThrow(() -> new RuntimeException("Cart not found"));
    }

    public CartModel removeItemFromCart(String cartId,String productId){
        Optional<CartModel> optionalCart = cartRepository.findById(cartId);

        if(optionalCart.isEmpty()){
            throw new RuntimeException("Cart not found");
        }

        CartModel cart = optionalCart.get();

        cart.getItems().removeIf(item -> item.getProduct().getId().equals(productId));

        double totalPrice = cart.getItems().stream().mapToDouble(item -> item.getProduct().getPrice()* item.getQuantity()).sum();

        cart.setTotalPrice(totalPrice);

        return cartRepository.save(cart);
    }
}