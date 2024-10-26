package dev.kamal.design_stock_broker_lld.service.factory;

import dev.kamal.design_stock_broker_lld.models.Portfolio;
import dev.kamal.design_stock_broker_lld.models.User;

public class UserFactory {
    public static User createUser(String type, String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPortfolio(new Portfolio());  // Initialize Portfolio
        user.setBalance(10000.0);  // Assign a starting balance for testing
        return user;
    }
}

