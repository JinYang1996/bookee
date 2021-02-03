package com.bookee.bookee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.bookee.bookee.properities.ProfileProperities;

@SpringBootApplication
@ComponentScan(basePackages={"com.bookee.bookee","com.bookee.event"})
@MapperScan(basePackages = {"**/mapper"})
@EnableConfigurationProperties(ProfileProperities.class)
public class BookeeApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(BookeeApplication.class, args);
    }

}
