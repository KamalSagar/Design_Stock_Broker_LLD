package dev.kamal.design_stock_broker_lld.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Trade {
    private String tradeID;
    private User user;
    private Stock stock;
    private int quantity;
    private String tradeType;

    // Constructor, Getters, and Setters
    public Trade(String tradeID, User user, Stock stock, int quantity, String tradeType) {
        this.tradeID = tradeID;
        this.user = user;
        this.stock = stock;
        this.quantity = quantity;
        this.tradeType = tradeType;
    }

    public String getTradeID() { return tradeID; }
    public void setTradeID(String tradeID) { this.tradeID = tradeID; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Stock getStock() { return stock; }
    public void setStock(Stock stock) { this.stock = stock; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getTradeType() { return tradeType; }
    public void setTradeType(String tradeType) { this.tradeType = tradeType; }
}

