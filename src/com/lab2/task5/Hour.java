package com.lab2.task5;

public class Hour {
    private String time;
    private int numberOfCustomers;
    private String comments;

    public Hour() {
    }

    public Hour(String time, int numberOfCustomers, String comments) {
        this.time = time;
        this.numberOfCustomers = numberOfCustomers;
        this.comments = comments;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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
