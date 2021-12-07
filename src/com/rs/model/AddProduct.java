
package com.rs.model;

public class AddProduct {
    private int id;
    private String productType;
    private String productName;
    private String productCode;
    private String ProductBarCode;
    private String productCategory;
    private double productCost;
    private double productPrice;
    private double productTax;
    private String taxMethod;
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

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductTax() {
        return productTax;
    }

    public void setProductTax(double productTax) {
        this.productTax = productTax;
    }

    public String getTaxMethod() {
        return taxMethod;
    }

    public void setTaxMethod(String taxMethod) {
        this.taxMethod = taxMethod;
    }

    public int getAlertQty() {
        return alertQty;
    }

    public void setAlertQty(int alertQty) {
        this.alertQty = alertQty;
    }
    
}
