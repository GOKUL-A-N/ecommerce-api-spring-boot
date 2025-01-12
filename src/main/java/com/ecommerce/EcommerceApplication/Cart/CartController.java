package com.ecommerce.EcommerceApplication.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/{userId}/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/{id}")
    public CartModel getCart(@PathVariable String id){
        return cartService.getCart(id);
    }

    @PostMapping
    public CartModel createCart(@RequestBody CartModel cart){
        return cartService.createCart(cart);
    }

    @PutMapping("/{id}/addItem")
    public CartModel addItemToCart(@PathVariable String id,@RequestBody String productId){
        return cartService.addItemToCart(id,productId);
    }

}
