package dev.kamal.design_stock_broker_lld.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stock {
    ExchType exchType;
    String name;
    Double price;

    public Stock(String name, Double price, ExchType exchType) {
        this.name = name;
        this.price = price;
        this.exchType = exchType;
    }
}
