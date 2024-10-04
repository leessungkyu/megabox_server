package com.Mega.MegaBox.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="regions")
public class RegionsModel {
    @Id
    private Integer regions_id;
    private String  regions_name;
    private String  useyn;

    public RegionsModel() {
    }

    public RegionsModel(Integer regions_id, String regions_name, String useyn) {
        this.regions_id = regions_id;
        this.regions_name = regions_name;
        this.useyn = useyn;
    }

    public Integer getRegions_id() {
        return regions_id;
    }

    public void setRegions_id(Integer regions_id) {
        this.regions_id = regions_id;
    }

    public String getRegions_name() {
        return regions_name;
    }

    public void setRegions_name(String regions_name) {
        this.regions_name = regions_name;
    }

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
        this.useyn = useyn;
    }
}
