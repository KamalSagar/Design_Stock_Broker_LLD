package dev.kamal.design_stock_broker_lld.controller;

import dev.kamal.design_stock_broker_lld.models.Stock;
import dev.kamal.design_stock_broker_lld.models.User;
import dev.kamal.design_stock_broker_lld.service.MarketDataService;
import dev.kamal.design_stock_broker_lld.service.factory.UserFactory;
import dev.kamal.design_stock_broker_lld.service.strategy.TradingStrategy;

public class UserController {
    private MarketDataService marketDataService = new MarketDataService();

    public void executeTrade(String userType, String stockSymbol, int quantity, TradingStrategy strategy) {
        Stock stock = marketDataService.getStock(stockSymbol);
        User user = UserFactory.createUser(userType, "John Doe", "john@example.com");

        strategy.executeTrade(user, stock, quantity);
    }
}

