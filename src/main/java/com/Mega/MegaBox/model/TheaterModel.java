package com.Mega.MegaBox.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="theaters")
public class TheaterModel {
    @Id
    private Integer theaters_id;
    private String  theaters_name;
    private Integer region_id;
    private String  useyn;

    public TheaterModel(Integer theaters_id, String theaters_name, Integer region_id, String useyn) {
        this.theaters_id = theaters_id;
        this.theaters_name = theaters_name;
        this.region_id = region_id;
        this.useyn = useyn;
    }

    public TheaterModel() {
    }

    public Integer getTheaters_id() {
        return theaters_id;
    }

    public void setTheaters_id(Integer theaters_id) {
        this.theaters_id = theaters_id;
    }

    public String getTheaters_name() {
        return theaters_name;
    }

    public void setTheaters_name(String theaters_name) {
        this.theaters_name = theaters_name;
    }

    public Integer getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Integer region_id) {
        this.region_id = region_id;
    }

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
        this.useyn = useyn;
    }
}
