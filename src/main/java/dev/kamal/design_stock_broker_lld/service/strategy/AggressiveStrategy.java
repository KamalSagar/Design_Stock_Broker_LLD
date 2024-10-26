package dev.kamal.design_stock_broker_lld.service.strategy;

import dev.kamal.design_stock_broker_lld.models.Stock;
import dev.kamal.design_stock_broker_lld.models.User;
import dev.kamal.design_stock_broker_lld.service.UserService;

public class AggressiveStrategy implements TradingStrategy {
    private UserService userService = new UserService();

    @Override
    public void executeTrade(User user, Stock stock, int quantity) {
        userService.buyStock(user, stock, quantity);
        System.out.println("Aggressively bought " + quantity + " shares of " + stock.getSymbol());
    }
}

