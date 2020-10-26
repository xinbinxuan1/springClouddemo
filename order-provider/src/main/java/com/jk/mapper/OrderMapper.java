package com.jk.mapper;

import com.jk.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<OrderEntity> findList();

    void deleteorder(Integer orderId);

    void insertOrder(OrderEntity order);

    void updateOrder(OrderEntity order);

    OrderEntity huixian(Integer orderId);
}
