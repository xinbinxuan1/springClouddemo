package com.jk.controller;

import com.jk.entity.OrderEntity;
import com.jk.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/showOne")
    @HystrixCommand(fallbackMethod = "showFail")
    public String showOne(){
        orderService.show();
        return "成功!!";
    }

    public String showFail(){
        return "showOne,页面找不到了!!";
    }

    @RequestMapping("/findList")
    public List<OrderEntity> findList(){
        return orderService.findList();
    }

    @RequestMapping("/deleteorder")
    public void deleteorder(Integer orderId){
        orderService.deleteorder(orderId);
    }

    @RequestMapping("/insertOrder")
    public String insertOrder(OrderEntity order){
        orderService.insertOrder(order);
        return "success";
    }

    @RequestMapping("/huixian")
    public OrderEntity huixian(Integer orderId){
        return orderService.huixian(orderId);
    }
}
