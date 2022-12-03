package cn.scnj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("cn.scnj.mapper")
public class StartUser {
    public static void main(String[] args) {
        SpringApplication.run(StartUser.class,args);
    }
}
