package com.example.newshop.service;

import org.springframework.stereotype.Component;

@Component
public interface Currency {
    public String display(String formatPrice);

}
