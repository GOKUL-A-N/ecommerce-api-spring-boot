package com.ecommerce.EcommerceApplication.Cart;

import com.ecommerce.EcommerceApplication.Product.ProductModel;
import com.ecommerce.EcommerceApplication.User.UserModel;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Cart")
@Data
public class CartModel {
    @Id
    private String id;

    @DBRef
    private UserModel user;

    @DBRef
    private List<ProductModel> products;

    private double totalAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public List<ProductModel> getProducts() {
        return products;
    }

    public void setProducts(List<ProductModel> products) {
        this.products = products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void addProduct(ProductModel product){
        products.add(product);
        totalAmount += product.getPrice();
    }

    public void removeproduct(ProductModel product){
        products.remove(product);
        totalAmount -= product.getPrice();
    }
}
