package com.chc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
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
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SeataThirdApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataThirdApplication.class, args);
    }

}
