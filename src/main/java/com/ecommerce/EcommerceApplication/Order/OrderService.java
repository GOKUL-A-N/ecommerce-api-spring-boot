//package com.ecommerce.EcommerceApplication.Order;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class OrderService {
//
//    @Autowired
//    private OrderRepository orderRepository;
//
//    public List<OrderModel> getAllOrdersById(String userid)
//    {
//        return orderRepository.findAllById(userid);
//    }
//
//    public List<List<OrderModel>> getAllOrders()
//    {
//        return orderRepository.findAll();
//    }
//
//    public OrderModel createOrder(OrderModel orderModel)
//    {
//        return orderRepository.save(orderModel);
//    }
//
//    public void deleteOrder(String id)
//    {
//        orderRepository.deleteById(id);
//    }
//}
