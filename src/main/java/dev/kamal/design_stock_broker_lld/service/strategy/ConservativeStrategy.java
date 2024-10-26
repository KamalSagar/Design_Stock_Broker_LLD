package dev.kamal.design_stock_broker_lld.service.strategy;

import dev.kamal.design_stock_broker_lld.models.Stock;
import dev.kamal.design_stock_broker_lld.models.User;
import dev.kamal.design_stock_broker_lld.service.UserService;

public class ConservativeStrategy implements TradingStrategy {
    private UserService userService = new UserService();

    @Override
    public void executeTrade(User user, Stock stock, int quantity) {
        // Conservative approach, maybe buy fewer stocks
        if (quantity > 1) quantity--;
        userService.buyStock(user, stock, quantity);
        System.out.println("Conservatively bought " + quantity + " shares of " + stock.getSymbol());
    }
}
