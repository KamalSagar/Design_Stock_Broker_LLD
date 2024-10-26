package dev.kamal.design_stock_broker_lld.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stock {
    private String stockID;
    private String symbol;
    private double price;

    // Constructor, Getters, and Setters
    public Stock(String stockID, String symbol, double price) {
        this.stockID = stockID;
        this.symbol = symbol;
        this.price = price;
    }

    public String getStockID() { return stockID; }
    public void setStockID(String stockID) { this.stockID = stockID; }

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

