package com.example.newshop.service;

import org.springframework.stereotype.Component;

@Component
public class Doller implements Currency{
    @Override
    public String display(String formatPrice) {
        return "Doller" + formatPrice;
    }
}
