package com.ecommerce.EcommerceApplication.Cart;

import com.ecommerce.EcommerceApplication.Product.ProductModel;
import com.ecommerce.EcommerceApplication.User.UserModel;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Cart")
@Data
public class CartModel {
    @Id
    private String id;

    @DBRef
    private List<CartItems> items = new ArrayList<>();

    private double totalPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<CartItems> getItems() {
        return items;
    }

    public void setItems(List<CartItems> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public CartModel() {}

    public CartModel(String id,List<CartItems> items,double totalPrice){
        this.id = id;
        this.items = items;
        this.totalPrice = totalPrice;
    }
}
