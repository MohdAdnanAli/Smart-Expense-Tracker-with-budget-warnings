package com.expense.dto;

public class WishlistDTO {

    private int itemId;
    private String itemName;
    private double itemCost;
    private String description;
    private int quantity;

    public WishlistDTO() {}

    public WishlistDTO(int itemId, String itemName, double itemCost, String description, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemCost = itemCost;
        this.description = description;
        this.quantity = quantity;
    }

    // Getters and Setters
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
