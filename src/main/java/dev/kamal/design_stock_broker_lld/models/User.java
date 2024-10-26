package dev.kamal.design_stock_broker_lld.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String userID;
    private String name;
    private String email;
    private Portfolio portfolio;
    private double balance;

    // Getters and Setters
    public String getUserID() { return userID; }
    public void setUserID(String userID) { this.userID = userID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}

