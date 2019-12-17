package com.chc;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Description: 启动类
 *
 * @author cuihaochong
 * @date 2019/12/12
 */
@MapperScan("com.chc.mapper")
@EnableEurekaClient
@SpringBootApplication
@EnableDistributedTransaction
public class LcnThirdApplication {

    public static void main(String[] args) {
        SpringApplication.run(LcnThirdApplication.class, args);
    }

}
