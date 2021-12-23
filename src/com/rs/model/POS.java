
package com.rs.model;

public class POS {
    private int  id;
    private int  invoice;
    private int totalQty;
    private double totalPrice;
    private double discount;
    private double vat;
    private double totalPayAmountVlaue;
    private String payMethod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvoice() {
        return invoice;
    }

    public void setInvoice(int invoice) {
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
    
}
