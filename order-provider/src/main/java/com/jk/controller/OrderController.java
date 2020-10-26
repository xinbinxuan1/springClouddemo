package com.jk.controller;

import com.jk.entity.OrderEntity;
import com.jk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/findList")
    public List<OrderEntity> findList(){
        return orderService.findList();
    }

    @RequestMapping("/deleteorder")
    public void deleteorder(@RequestParam Integer orderId){
        orderService.deleteorder(orderId);
    }

    @RequestMapping("/insertOrder")
    public void insertOrder(@RequestBody OrderEntity order){
        orderService.insertOrder(order);
    }

    @RequestMapping("/huixian")
    public OrderEntity huixian(@RequestParam Integer orderId){
        return orderService.huixian(orderId);
    }
}
