package com.chc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Description: 启动类
 *
 * @author cuihaochong
 * @date 2019/12/12
 */
@MapperScan("com.chc.mapper")
@SpringBootApplication
public class LocalTranServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocalTranServerApplication.class, args);
    }

}
