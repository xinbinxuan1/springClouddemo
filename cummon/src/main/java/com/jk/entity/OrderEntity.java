package com.jk.entity;

import lombok.Data;

@Data
public class OrderEntity {

    private Integer orderId;

    private  String createData;

    private String orderName;

    private Integer orderPrice;

    private  Integer orderStatic;

    private Integer orderZffs;

    private String zfName;
}
