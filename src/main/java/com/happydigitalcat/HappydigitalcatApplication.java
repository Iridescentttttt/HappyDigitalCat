package com.happydigitalcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class HappydigitalcatApplication {

    public static void main(String[] args) {
        SpringApplication.run(HappydigitalcatApplication.class, args);
    }

}
