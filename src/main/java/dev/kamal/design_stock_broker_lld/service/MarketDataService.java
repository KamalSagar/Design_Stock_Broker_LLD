package dev.kamal.design_stock_broker_lld.service;

import dev.kamal.design_stock_broker_lld.models.Stock;

import java.util.HashMap;
import java.util.Map;

public class MarketDataService {
    private Map<String, Stock> stockMarket;

    public MarketDataService() {
        stockMarket = new HashMap<>();
        // Mock stock data
        stockMarket.put("AAPL", new Stock("1", "AAPL", 150.00));
        stockMarket.put("GOOG", new Stock("2", "GOOG", 2800.00));
    }

    public Stock getStock(String symbol) {
        return stockMarket.get(symbol);
    }
}

