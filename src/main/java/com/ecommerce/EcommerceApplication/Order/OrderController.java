//package com.ecommerce.EcommerceApplication.Order;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/order")
//public class OrderController {
//
//    @Autowired
//    private OrderService orderService;
//
//    @PostMapping
//    public OrderModel createOrder(@RequestBody OrderModel orderModel)
//    {
//        return orderService.createOrder(orderModel);
//    }
//
//    @DeleteMapping
//    public void deleteOrder(@PathVariable String id)
//    {
//        orderService.deleteOrder(id);
//    }
//}
