package com.syoki.springboot2servlet;

import com.syoki.springboot2servlet.servlet.MyServlet1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class Springboot2ServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2ServletApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean MyServlet1(){
        return new ServletRegistrationBean(new MyServlet1(),"/myServlet1/*");
    }
}
