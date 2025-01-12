package com.ecommerce.EcommerceApplication.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userrepository;

    public List<UserModel> getAllusers()
    {
        return userrepository.findAll();
    }

    public UserModel getUser(String id)
    {
        return userrepository.findById(id).orElse(null);
    }

    public UserModel createUser(UserModel userModel)
    {
        return userrepository.save(userModel);
    }

    public void deleteUser(String id)
    {
        userrepository.deleteById(id);
    }
}
