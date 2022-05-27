package com.example.newshop.service;

import org.springframework.stereotype.Component;

import java.text.DecimalFormat;

@Component
public class Format implements CurrencyFormatter{

    @Override
    public String format1(int price) {
        DecimalFormat d = new DecimalFormat("#,###");
        String result = d.format(price);
        return result;
    }
}
