package com.Mega.MegaBox.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "event")
public class EventModel {
    @Id
    private Integer EVENT_ID;
    private String EVENT_TITLE;
    private Date EVENT_BEGIN;
    private Date EVENT_END;
    private String EVENT_IMG;

    public EventModel() {
    }

    public EventModel(Integer EVENT_ID, String EVENT_TITLE, Date EVENT_BEGIN, Date EVENT_END, String EVENT_IMG) {
        this.EVENT_ID = EVENT_ID;
        this.EVENT_TITLE = EVENT_TITLE;
        this.EVENT_BEGIN = EVENT_BEGIN;
        this.EVENT_END = EVENT_END;
        this.EVENT_IMG = EVENT_IMG;
    }

    public Integer getEVENT_ID() {
        return EVENT_ID;
    }

    public void setEVENT_ID(Integer EVENT_ID) {
        this.EVENT_ID = EVENT_ID;
    }

    public String getEVENT_TITLE() {
        return EVENT_TITLE;
    }

    public void setEVENT_TITLE(String EVENT_TITLE) {
        this.EVENT_TITLE = EVENT_TITLE;
    }

    public Date getEVENT_BEGIN() {
        return EVENT_BEGIN;
    }

    public void setEVENT_BEGIN(Date EVENT_BEGIN) {
        this.EVENT_BEGIN = EVENT_BEGIN;
    }

    public Date getEVENT_END() {
        return EVENT_END;
    }

    public void setEVENT_END(Date EVENT_END) {
        this.EVENT_END = EVENT_END;
    }

    public String getEVENT_IMG() {
        return EVENT_IMG;
    }

    public void setEVENT_IMG(String EVENT_IMG) {
        this.EVENT_IMG = EVENT_IMG;
    }
}
