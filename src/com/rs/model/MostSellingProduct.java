package com.rs.model;

public class MostSellingProduct {

    private int sellingId;
    private int productId;
    private String productName;
    private int quantity;
    private double totalIncome;

    public int getSellingId() {
        return sellingId;
    }

    public void setSellingId(int sellingId) {
        this.sellingId = sellingId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }
    
}
