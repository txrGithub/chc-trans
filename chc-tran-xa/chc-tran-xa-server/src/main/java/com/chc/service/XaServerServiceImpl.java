package com.chc.service;

import com.chc.api.AccountApi;
import com.chc.client.XaThirdClient;
import com.chc.mapper.BankAMapper;
import com.chc.pojo.entity.BankA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description:
 *
 * @author cuihaochong
 * @date 2019/12/13
 */
@Service("xaServerService")
public class XaServerServiceImpl implements AccountApi {

    @Autowired
    BankAMapper bankAMapper;
    @Autowired
    XaThirdClient xaThirdClient;

    @Override
    @Transactional
    public void transfer(int money) {
        bankAMapper.insert(BankA.initial(-money));
        System.out.println("BankA转账: " + -money);

        xaThirdClient.transfer(money);
        System.out.println("第三方BankB收账: " + money);

        if (money >= 20 && money < 30) {
            throw new RuntimeException("server is error,money too large");
        }
    }
}
