
package com.rs.model;

public class Product {
    private int id;
    private String productType;
    private String productName;
    private String productCode;
    private String ProductBarCode;
    private String productCategory;
    private int quantity;
    private double buyingCost;
    private double othersCost;
    private double toalPrice;
    private double sellingCost;
    private String supplier;
    private int alertQty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductBarCode() {
        return ProductBarCode;
    }

    public void setProductBarCode(String ProductBarCode) {
        this.ProductBarCode = ProductBarCode;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getBuyingCost() {
        return buyingCost;
    }

    public void setBuyingCost(double buyingCost) {
        this.buyingCost = buyingCost;
    }

    public double getOthersCost() {
        return othersCost;
    }

    public void setOthersCost(double othersCost) {
        this.othersCost = othersCost;
    }

    public double getToalPrice() {
        return toalPrice;
    }

    public void setToalPrice(double toalPrice) {
        this.toalPrice = toalPrice;
    }

    public double getSellingCost() {
        return sellingCost;
    }

    public void setSellingCost(double sellingCost) {
        this.sellingCost = sellingCost;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public int getAlertQty() {
        return alertQty;
    }

    public void setAlertQty(int alertQty) {
        this.alertQty = alertQty;
    }
    

    
    
}
