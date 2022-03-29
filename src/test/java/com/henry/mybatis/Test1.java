package com.henry.mybatis;

import com.henry.mybatis.dao.MoneyAccountBalanceLogMapper;
import com.henry.mybatis.entity.MoneyAccountBalanceLog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test1 {
    @Autowired
    MoneyAccountBalanceLogMapper moneyAccountBalanceLogMapper;

    @Test
    public void test1(){
        MoneyAccountBalanceLog res = moneyAccountBalanceLogMapper.selectByPrimaryKey(1075863l);
        System.out.println(res.getAddAmount());
    }
}
