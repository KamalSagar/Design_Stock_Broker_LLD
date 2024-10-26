package dev.kamal.design_stock_broker_lld.service.strategy;

import dev.kamal.design_stock_broker_lld.models.Stock;
import dev.kamal.design_stock_broker_lld.models.User;

public interface TradingStrategy {
    void executeTrade(User user, Stock stock, int quantity);
}

