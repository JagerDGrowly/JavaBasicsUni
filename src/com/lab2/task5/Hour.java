package com.lab2.task5;

public class Hour {
    private int numberOfCustomers;
    private String comments;

    public Hour() {
    }

    public Hour(int numberOfCustomers, String comments) {
        this.numberOfCustomers = numberOfCustomers;
        this.comments = comments;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public void setNumberOfCustomers(int numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
