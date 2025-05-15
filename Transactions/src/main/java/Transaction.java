package com.pluralsight;

public class Transaction {
    private String date;
    private String time;
    private String description;
    private String vendor;
    private double amount;

    //CONSTRUCTOR BUILDING THE TRANSACTION OBJECT
    public Transaction(String date, String time, String description, String vendor, double amount){
        //THIS.FIELD = STORING EACH VALUE OF THIS IN THE OBJECT
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }
    //GETTERS & SETTERS FOR EACH OBJECT
    //USED TO RETRIEVE INFO FOR EACH FIELD
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }






}
