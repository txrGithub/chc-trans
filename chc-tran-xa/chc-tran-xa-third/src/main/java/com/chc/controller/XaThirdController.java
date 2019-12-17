package com.chc.controller;

import com.chc.api.AccountApi;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @author cuihaochong
 * @date 2019/12/13
 */
@RestController
@RequestMapping("xa/third")
public class XaThirdController {
    @Resource(name = "xaThirdService")
    AccountApi accountApi;

    @GetMapping("transfer/{money}")
    public void transfer(@PathVariable("money") int money) {
        accountApi.transfer(money);
    }

}
