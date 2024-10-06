package com.czy.cloud.service;

import com.czy.cloud.entities.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);

}