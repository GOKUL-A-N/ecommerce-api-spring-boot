package com.ecommerce.EcommerceApplication.Cart;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends MongoRepository<CartModel,String> {
}
