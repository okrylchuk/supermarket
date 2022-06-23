package com.naukma.supermarket;

import com.naukma.supermarket.model.security.Role;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.ServletOutputStream;

@SpringBootApplication
public class SupermarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermarketApplication.class, args);

        System.out.println(Role.valueOf("ADMIN").toString());
    }

}
