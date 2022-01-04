package com.rs.model;

public class POS {

    private int id;
    private String invoice;
    private int totalQty;
    private double totalPrice;
    private double discount;
    private double vat;
    private double totalPayAmountVlaue;
    private String payMethod;
    private double totalPayable;
    private double balance;
    private String customerName;
    private String sellDate;

    public String getSellDate() {
        return sellDate;
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getTotalPayAmountVlaue() {
        return totalPayAmountVlaue;
    }

    public void setTotalPayAmountVlaue(double totalPayAmountVlaue) {
        this.totalPayAmountVlaue = totalPayAmountVlaue;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public double getTotalPayable() {
        return totalPayable;
    }

    public void setTotalPayable(double totalPayable) {
        this.totalPayable = totalPayable;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

   

}
