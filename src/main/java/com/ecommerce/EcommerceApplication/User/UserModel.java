package com.ecommerce.EcommerceApplication.User;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
@Data
public class UserModel {

    @Id
    private String id;

    private String firstname;

    private String lastname;

    private String email;

    private String password;

    private String phone;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserModel()
    {

    }

    public UserModel(String firstname,String lastname,String email,String password,String phone)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        this.password=password;
        this.phone=phone;
    }
}
