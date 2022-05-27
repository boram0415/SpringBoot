package com.example.newshop.service;

import org.springframework.stereotype.Component;

@Component
public interface CurrencyFormatter {
    public String format1(int price);

}
