package com.example.springcorehw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    final Cart cart;

    @Autowired
    public OrderService(Cart cart) {
        this.cart = cart;
    }

    public void formOrder() {
        System.out.println(cart);
    }
}
