package com.example.newshop.Maincontroller;

import com.example.newshop.domain.Item;
import com.example.newshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contoroller {
    @Autowired
    ItemService is ;

    @GetMapping
    public String hello(){
        return "hello world";
    }

    @GetMapping("/item")
    public Item Item(){
        Item item = new Item();
        item.setItemName("나이키");
        item.setItemPrice(12000);
        return item;
    }

    @GetMapping ("/service")
    public Item Service(){
        return is.getItem();
    }

}
