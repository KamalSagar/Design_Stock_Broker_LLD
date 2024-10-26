package dev.kamal.design_stock_broker_lld;

import dev.kamal.design_stock_broker_lld.controller.UserController;
import dev.kamal.design_stock_broker_lld.service.strategy.AggressiveStrategy;
import dev.kamal.design_stock_broker_lld.service.strategy.ConservativeStrategy;
import dev.kamal.design_stock_broker_lld.service.strategy.TradingStrategy;

public class Client {
    public static void main(String[] args) {
        // Initialize UserController
        UserController userController = new UserController();

        // Define test data
        String userType = "regular";         // Simulating a regular user
        String stockSymbol = "AAPL";         // Stock symbol to trade
        int aggressiveQuantity = 10;         // Quantity to buy aggressively
        int conservativeQuantity = 5;        // Quantity to buy conservatively

        // Strategy 1: Aggressive Trading Strategy
        System.out.println("Testing Aggressive Strategy:");
        TradingStrategy aggressiveStrategy = new AggressiveStrategy();
        userController.executeTrade(userType, stockSymbol, aggressiveQuantity, aggressiveStrategy);

        // Strategy 2: Conservative Trading Strategy
        System.out.println("\nTesting Conservative Strategy:");
        TradingStrategy conservativeStrategy = new ConservativeStrategy();
        userController.executeTrade(userType, stockSymbol, conservativeQuantity, conservativeStrategy);
    }
}
