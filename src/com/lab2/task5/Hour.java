package com.lab2.task5;

/**
 * Represents an hour of operation for a kiosk, including the time, number of customers, and comments.
 * This class is used to store data about customer activity during a specific hour.
 */
public class Hour {
    private String time;
    private int numberOfCustomers;
    private String comments;

    /**
     * Default constructor that creates an empty Hour object.
     * Fields must be set using setters after creation.
     */
    public Hour() {
    }

    /**
     * Constructor that initializes an Hour object with the specified time, number of customers, and comments.
     *
     * @param time             the time of the hour (e.g., "8 a.m.")
     * @param numberOfCustomers the number of customers during this hour
     * @param comments         a comment describing the activity during this hour
     */
    public Hour(String time, int numberOfCustomers, String comments) {
        this.time = time;
        this.numberOfCustomers = numberOfCustomers;
        this.comments = comments;
    }

    /**
     * Gets the time of the hour.
     *
     * @return the time of the hour as a string (e.g., "8 a.m.")
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the time of the hour.
     *
     * @param time the time to set (e.g., "8 a.m.")
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Gets the number of customers during this hour.
     *
     * @return the number of customers as an integer
     */
    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    /**
     * Sets the number of customers during this hour.
     *
     * @param numberOfCustomers the number of customers to set
     */
    public void setNumberOfCustomers(int numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }

    /**
     * Gets the comments for this hour.
     *
     * @return the comments as a string
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the comments for this hour.
     *
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
