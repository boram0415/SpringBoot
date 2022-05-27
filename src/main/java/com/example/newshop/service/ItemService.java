package com.example.newshop.service;

import com.example.newshop.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class ItemService {
    @Qualifier("won")
    @Autowired
    Currency currency;
    @Autowired
    CurrencyFormatter format;

    public Item getItem(){
        Item item = new Item();
        item.setItemName("아디다스");
        item.setItemPrice(5000);
        item.setFormat(format);
        item.setCy(currency);
        return item;
    }



}
