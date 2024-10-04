package com.Mega.MegaBox.model;

public class BookingSeatRequest {
    private Integer booking_pin;
    private String  seat;

    public BookingSeatRequest() {
    }

    public BookingSeatRequest(Integer booking_pin, String seat) {
        this.booking_pin = booking_pin;
        this.seat = seat;
    }

    public Integer getBooking_pin() {
        return booking_pin;
    }

    public void setBooking_pin(Integer booking_pin) {
        this.booking_pin = booking_pin;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
