package com.jk.service;

import com.jk.entity.OrderEntity;
import com.jk.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<OrderEntity> findList() {
        return orderMapper.findList();
    }

    @Override
    public void deleteorder(Integer orderId) {
        orderMapper.deleteorder(orderId);
    }

    @Override
    public void insertOrder(OrderEntity order) {
        if (order.getOrderId()==null){
            orderMapper.insertOrder(order);
        }else{
            orderMapper.updateOrder(order);
        }
    }

    @Override
    public OrderEntity huixian(Integer orderId) {
        return orderMapper.huixian(orderId);
    }
}
