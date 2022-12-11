package com.example.springcorehw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringcorehwApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringcorehwApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean("productService", ProductService.class);
        Cart cart = context.getBean("cart", Cart.class);
        productService.printAll();
        cart.add(productService.findByTitle("Product1"));
        cart.add(productService.findByTitle("Product5"));
        cart.add(productService.findByTitle("Product10"));
        OrderService orderService = context.getBean("orderService", OrderService.class);
        orderService.formOrder();

    }

}
