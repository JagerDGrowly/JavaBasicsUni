package com.lab2.task5;

/**
 * Represents a kiosk with a name, address, and an array of hours of operation.
 * Each hour contains information about customer activity during that time.
 */
public class Kiosk {
    private String name;
    private String address;
    private Hour[] hours;

    /**
     * Gets the name of the kiosk.
     *
     * @return the name of the kiosk as a string
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the kiosk.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the address of the kiosk.
     *
     * @return the address of the kiosk as a string
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the kiosk.
     *
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the Hour object at the specified index in the hours array.
     *
     * @param i the index of the hour to retrieve
     * @return the Hour object at the specified index
     * @throws ArrayIndexOutOfBoundsException if the index is out of bounds
     */
    public Hour getHour(int i) {
        return hours[i];
    }

    /**
     * Sets the Hour object at the specified index in the hours array.
     *
     * @param i    the index at which to set the hour
     * @param hour the Hour object to set
     * @throws ArrayIndexOutOfBoundsException if the index is out of bounds
     */
    public void setHour(int i, Hour hour) {
        hours[i] = hour;
    }

    /**
     * Adds a new Hour object to the hours array.
     *
     * @param hour the Hour object to add
     */
    public void addHour(Hour hour) {
        setHours(HourUtilities.addToArray(getHours(), hour));
    }

    /**
     * Adds a new Hour object to the hours array by creating it from the specified parameters.
     *
     * @param time             the time of the hour (e.g., "8 a.m.")
     * @param numberOfCustomers the number of customers during this hour
     * @param comments         a comment describing the activity during this hour
     */
    public void addHour(String time, int numberOfCustomers, String comments) {
        Hour hour = new Hour(time, numberOfCustomers, comments);
        addHour(hour);
    }

    /**
     * Gets the number of hours in the hours array.
     *
     * @return the number of hours, or 0 if the hours array is null
     */
    public int hoursCount() {
        return hours.length;
    }

    /**
     * Clears the hours array by setting it to null.
     */
    public void clearHours() {
        hours = null;
    }

    /**
     * Gets the array of hours for this kiosk.
     *
     * @return the array of Hour objects, or null if no hours have been added
     */
    public Hour[] getHours() {
        return hours;
    }

    /**
     * Sets the array of hours for this kiosk.
     *
     * @param hours the array of Hour objects to set
     */
    public void setHours(Hour[] hours) {
        this.hours = hours;
    }
}
