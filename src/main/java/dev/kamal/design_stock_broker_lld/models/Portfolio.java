package dev.kamal.design_stock_broker_lld.models;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<Stock> stocks;

    public Portfolio() {
        stocks = new ArrayList<>();
    }

    public List<Stock> getStocks() { return stocks; }
    public void addStock(Stock stock) { stocks.add(stock); }
    public void removeStock(Stock stock) { stocks.remove(stock); }
}

