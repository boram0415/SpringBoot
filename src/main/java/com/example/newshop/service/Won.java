package com.example.newshop.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Won implements Currency{
    @Override
    public String display(String formatPrice) {
        return "WON : " + formatPrice ;
    }
}
