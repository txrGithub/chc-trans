package com.chc.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Description:
 *
 * @author cuihaochong
 * @date 2019/12/13
 */
@FeignClient(name = "xa-third")
public interface XaThirdClient {

    @GetMapping("xa/third/transfer/{money}")
    void transfer(@PathVariable("money") int money);
}
