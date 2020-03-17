package com.bookee.bookee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.bookee.bookee"})
@MapperScan(basePackages = {"**/mapper"})
public class BookeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookeeApplication.class, args);
    }

}
