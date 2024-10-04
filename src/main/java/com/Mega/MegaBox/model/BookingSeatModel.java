package com.Mega.MegaBox.model;

import jakarta.persistence.*;

@Entity
@Table(name = "booking_seats")
public class BookingSeatModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seats_pin;

    private Integer booking_pin;
    private String  seat;

    public BookingSeatModel() {
    }

    public BookingSeatModel( Integer booking_pin, String seat) {
        this.booking_pin = booking_pin;
        this.seat = seat;
    }

    public Integer getSeats_pin() {
        return seats_pin;
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
