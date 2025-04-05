package com.lab2.task5;

public class Kiosk {
    private String name;
    private String address;
    private Hour[] hours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Hour getHour(int i) {
        return hours[i];
    }

    public void setHour(int i, Hour hour) {
        hours[i] = hour;
    }

    public void addHour(Hour hour) {
        setHours(HourUtilities.addToArray(getHours(), hour));
    }

    public void addHour(String time, int numberOfCustomers, String comments) {
        Hour hour = new Hour(time, numberOfCustomers, comments);
        addHour(hour);
    }

    public int hoursCount() {
        return hours.length;
    }

    public void clearHours() {
        hours = null;
    }

    public Hour[] getHours() {
        return hours;
    }

    public void setHours(Hour[] hours) {
        this.hours = hours;
    }
}
