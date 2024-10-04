package com.Mega.MegaBox.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class MyPageModel {

    @Id
    private String USER_ID;
    private Integer USER_PIN;
    private String USER_PW;
    private String USER_NAME;
    private String USER_TEL;
    private String USER_ZIP;
    private String USER_ADDRESS1;
    private String USER_ADDRESS2;

    public MyPageModel() {
    }

    public MyPageModel(String USER_ID, String USER_PW, String USER_NAME, String USER_TEL) {
        this.USER_ID = USER_ID;
        this.USER_PW = USER_PW;
        this.USER_NAME = USER_NAME;
        this.USER_TEL = USER_TEL;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public Integer getUSER_PIN() {
        return USER_PIN;
    }

    public void setUSER_PIN(Integer USER_PIN) {
        this.USER_PIN = USER_PIN;
    }

    public String getUSER_PW() {
        return USER_PW;
    }

    public void setUSER_PW(String USER_PW) {
        this.USER_PW = USER_PW;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getUSER_TEL() {
        return USER_TEL;
    }

    public void setUSER_TEL(String USER_TEL) {
        this.USER_TEL = USER_TEL;
    }

    public String getUSER_ZIP() {
        return USER_ZIP;
    }

    public void setUSER_ZIP(String USER_ZIP) {
        this.USER_ZIP = USER_ZIP;
    }

    public String getUSER_ADDRESS1() {
        return USER_ADDRESS1;
    }

    public void setUSER_ADDRESS1(String USER_ADDRESS1) {
        this.USER_ADDRESS1 = USER_ADDRESS1;
    }

    public String getUSER_ADDRESS2() {
        return USER_ADDRESS2;
    }

    public void setUSER_ADDRESS2(String USER_ADDRESS2) {
        this.USER_ADDRESS2 = USER_ADDRESS2;
    }
}
