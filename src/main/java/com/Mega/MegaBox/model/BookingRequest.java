package com.Mega.MegaBox.model;

public class BookingRequest {
    private String booking_id;
    private Integer time_id;
    private Integer user_pin;

    public BookingRequest() {
    }

    public BookingRequest(String booking_id, Integer time_id, Integer user_pin) {
        this.booking_id = booking_id;
        this.time_id = time_id;
        this.user_pin = user_pin;
    }

    public String getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(String booking_id) {
        this.booking_id = booking_id;
    }

    public Integer getTime_id() {
        return time_id;
    }

    public void setTime_id(Integer time_id) {
        this.time_id = time_id;
    }

    public Integer getUser_pin() {
        return user_pin;
    }

    public void setUser_pin(Integer user_pin) {
        this.user_pin = user_pin;
    }
}
