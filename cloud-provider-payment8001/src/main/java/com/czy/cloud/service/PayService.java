package com.czy.cloud.service;

import com.czy.cloud.entities.Pay;

import java.util.List;

public interface PayService {

    int add(Pay pay);
    int delete(Integer payId);
    int update(Pay pay);

    Pay getById(Integer payId);

    List<Pay> getAll();
}
