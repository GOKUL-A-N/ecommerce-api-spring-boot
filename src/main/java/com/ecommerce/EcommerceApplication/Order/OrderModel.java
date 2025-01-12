//package com.ecommerce.EcommerceApplication.Order;
//
//import lombok.Data;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//@Document(collection = "Order")
//@Data
//public class OrderModel {
//
//    @Id
//    private String id;
//
//    private int ordernumber;
//
//    private String userid;
//
//
//    private boolean status;
//
//    private String date;
//
//    private String totalamount;
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public int getOrdernumber() {
//        return ordernumber;
//    }
//
//    public void setOrdernumber(int ordernumber) {
//        this.ordernumber = ordernumber;
//    }
//
//    public String getUserid() {
//        return userid;
//    }
//
//    public void setUserid(String userid) {
//        this.userid = userid;
//    }
//
//    public boolean isStatus() {
//        return status;
//    }
//
//    public void setStatus(boolean status) {
//        this.status = status;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public String getTotalamount() {
//        return totalamount;
//    }
//
//    public void setTotalamount(String totalamount) {
//        this.totalamount = totalamount;
//    }
//}
