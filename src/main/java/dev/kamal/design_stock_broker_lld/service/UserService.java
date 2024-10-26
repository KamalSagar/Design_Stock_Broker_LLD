package dev.kamal.design_stock_broker_lld.service;

import dev.kamal.design_stock_broker_lld.models.Portfolio;
import dev.kamal.design_stock_broker_lld.models.Stock;
import dev.kamal.design_stock_broker_lld.models.User;

public class UserService {
    // Simple User operations
    public void buyStock(User user, Stock stock, int quantity) {
        Portfolio portfolio = user.getPortfolio();
        portfolio.addStock(stock);
        // Deduct amount from user's balance
        user.setBalance(user.getBalance() - stock.getPrice() * quantity);
    }

    public void sellStock(User user, Stock stock, int quantity) {
        Portfolio portfolio = user.getPortfolio();
        portfolio.removeStock(stock);
        // Add amount to user's balance
        user.setBalance(user.getBalance() + stock.getPrice() * quantity);
    }
}
