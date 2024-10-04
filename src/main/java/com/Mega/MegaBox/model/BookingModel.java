package com.Mega.MegaBox.model;

import jakarta.persistence.*;

@Entity
@Table(name = "booking_movie")
public class BookingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer booking_pin;
    @Column(name = "booking_id")
    private String bookingId;
    @Column(name = "time_id")
    private Integer timeId;
    private Integer user_pin;

    public BookingModel() {
    }

    public BookingModel(Integer booking_pin, String bookingId, Integer timeId, Integer user_pin) {
        this.booking_pin = booking_pin;
        this.bookingId = bookingId;
        this.timeId = timeId;
        this.user_pin = user_pin;
    }

    public Integer getBooking_pin() {
        return booking_pin;
    }

    public void setBooking_pin(Integer booking_pin) {
        this.booking_pin = booking_pin;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getTimeId() {
        return timeId;
    }

    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }

    public Integer getUser_pin() {
        return user_pin;
    }

    public void setUser_pin(Integer user_pin) {
        this.user_pin = user_pin;
    }
}
