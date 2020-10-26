package com.jk.service;

import com.jk.entity.OrderEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "order-provider")
public interface OrderService {

    @RequestMapping("/show")
    void show();

    @RequestMapping("/findList")
    public List<OrderEntity> findList();

    @RequestMapping("/deleteorder")
    public void deleteorder(@RequestParam Integer orderId);

    @RequestMapping("/insertOrder")
    public void insertOrder(@RequestBody OrderEntity order);

    @RequestMapping("/huixian")
    public OrderEntity huixian(@RequestParam Integer orderId);
}
