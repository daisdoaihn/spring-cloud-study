package com.czy.cloud.service.impl;

import com.czy.cloud.entities.Pay;
import com.czy.cloud.mapper.PayMapper;
import com.czy.cloud.service.PayService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private PayMapper payMapper;
    @Override
    public int add(Pay pay) {
        return payMapper.insertSelective(pay);
    }

    @Override
    public int delete(Integer payId) {
        return payMapper.deleteByPrimaryKey(payId);
    }

    @Override
    public int update(Pay pay) {
        //更新不为null的值
        return payMapper.updateByPrimaryKeySelective(pay);
    }

    @Override
    public Pay getById(Integer payId) {
        return payMapper.selectByPrimaryKey(payId);
    }

    @Override
    public List<Pay> getAll() {
        return payMapper.selectAll();
    }
}
