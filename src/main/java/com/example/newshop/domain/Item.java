package com.example.newshop.domain;

import com.example.newshop.service.Currency;
import com.example.newshop.service.CurrencyFormatter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;


public class Item {

    @Setter
    @Getter
    private String ItemName;
    @Setter
    private int ItemPrice;
    @Setter
    private Currency cy;
    @Setter
    private CurrencyFormatter format;

    public String getItemPrice() {
        return  cy.display(format.format1(this.ItemPrice));
    }


}
