package com.chc.controller;

import com.chc.api.AccountApi;
import com.chc.base.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @author cuihaochong
 * @date 2019/12/13
 */
@Api(tags = "XA事务示例")
@RestController
@RequestMapping("xa")
public class XaServerController {
    @Resource(name = "xaServerService")
    AccountApi accountApi;

    @ApiOperation(value = "XA分布式事务")
    @GetMapping("/transfer/{money}")
    public Result<String> declareTransfer(@PathVariable("money") int money) {
        accountApi.transfer(money);
        return Result.success();
    }


}
