package com.henry.mybatis.service;

import com.henry.mybatis.dao.MoneyAccountBalanceLogMapper;
import com.henry.mybatis.entity.MoneyAccountBalanceLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private MoneyAccountBalanceLogMapper moneyAccountBalanceLogMapper;



    public MoneyAccountBalanceLog selectByPrimaryKey(Long id){
        return moneyAccountBalanceLogMapper.selectByPrimaryKey(id);
    }




}
