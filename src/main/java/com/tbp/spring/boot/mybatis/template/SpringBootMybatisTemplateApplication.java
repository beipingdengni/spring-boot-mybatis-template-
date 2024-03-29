package com.tbp.spring.boot.mybatis.template;

import com.tbp.spring.boot.mybatis.template.common.MyMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(
        basePackages = "com.tbp.spring.boot.mybatis.template.mapper"
//       ,markerInterface = MyMapper.class
)
public class SpringBootMybatisTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisTemplateApplication.class, args);
    }

}
