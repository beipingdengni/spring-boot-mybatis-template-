package com.tbp.spring.boot.mybatis.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableTransactionManagement
//@EnableJpaRepositories
//@MapperScan("com.tbp.spring.boot.mybatis.template.mapper")
public class SpringBootMybatisTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisTemplateApplication.class, args);
    }

}
