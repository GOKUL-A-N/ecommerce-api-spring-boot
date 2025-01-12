package com.ecommerce.EcommerceApplication.Cart;

import com.ecommerce.EcommerceApplication.Product.ProductModel;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class CartItems {

    @DBRef
    private ProductModel product;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }
}
