package com.jk.service;

import com.jk.entity.OrderEntity;

import java.util.List;

public interface OrderService {

    List<OrderEntity> findList();

    void deleteorder(Integer orderId);

    void insertOrder(OrderEntity order);

    OrderEntity huixian(Integer orderId);
}
