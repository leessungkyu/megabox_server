package com.Mega.MegaBox.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="times")
public class TimesModel {
    @Id
    private Integer times_id;
    private Integer theaters_id;
    private Integer movies_id;
    private String time;
    private String hall;
    private String seats;
    private String useyn;

    public TimesModel() {
    }

    public TimesModel(Integer times_id, Integer theaters_id, Integer movies_id, String time, String hall, String seats, String useyn) {
        this.times_id = times_id;
        this.theaters_id = theaters_id;
        this.movies_id = movies_id;
        this.time = time;
        this.hall = hall;
        this.seats = seats;
        this.useyn = useyn;
    }

    public Integer getTimes_id() {
        return times_id;
    }

    public void setTimes_id(Integer times_id) {
        this.times_id = times_id;
    }

    public Integer getTheaters_id() {
        return theaters_id;
    }

    public void setTheaters_id(Integer theaters_id) {
        this.theaters_id = theaters_id;
    }

    public Integer getMovies_id() {
        return movies_id;
    }

    public void setMovies_id(Integer movies_id) {
        this.movies_id = movies_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
        this.useyn = useyn;
    }
}
