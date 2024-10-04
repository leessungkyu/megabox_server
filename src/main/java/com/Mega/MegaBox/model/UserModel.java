package com.Mega.MegaBox.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동으로 숫자 늘어남
    private String user_pin;
    private String username;
    private String password;
    private String user_name;
    private String user_tel;
    private String user_zip;
    private String user_address1;
    private String user_address2;
    private String user_role;

    public UserModel() {
    }

    public UserModel(String user_pin, String username, String password, String user_name, String user_tel, String user_zip, String user_address1, String user_address2, String user_role) {
        this.user_pin = user_pin;
        this.username = username;
        this.password = password;
        this.user_name = user_name;
        this.user_tel = user_tel;
        this.user_zip = user_zip;
        this.user_address1 = user_address1;
        this.user_address2 = user_address2;
        this.user_role = user_role;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public String getUser_pin() {
        return user_pin;
    }

    public void setUser_pin(String user_pin) {
        this.user_pin = user_pin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public String getUser_zip() {
        return user_zip;
    }

    public void setUser_zip(String user_zip) {
        this.user_zip = user_zip;
    }

    public String getUser_address1() {
        return user_address1;
    }

    public void setUser_address1(String user_address1) {
        this.user_address1 = user_address1;
    }

    public String getUser_address2() {
        return user_address2;
    }

    public void setUser_address2(String user_address2) {
        this.user_address2 = user_address2;
    }
}
