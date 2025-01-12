package com.ecommerce.EcommerceApplication.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping
    public CartModel createCart(){
        return cartService.createCart();
    }

    @PostMapping("/{cartId}/add")
    public CartModel addItemCart(
            @PathVariable String cartId,
            @RequestParam String productId,
            @RequestParam int quantity
    ){
        return cartService.addItemToCart(cartId,productId,quantity);
    }

    @GetMapping("/{cartId}")
    public CartModel getCart(@PathVariable String cartId){
        return cartService.getCart(cartId);
    }

    @PostMapping("/{cartId}/remove")
    public CartModel removeItemFromCart(
            @PathVariable String cartId,
            @RequestParam String productId) {
        return cartService.removeItemFromCart(cartId, productId);
    }
}