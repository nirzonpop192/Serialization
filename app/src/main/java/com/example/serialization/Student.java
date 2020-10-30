package com.example.serialization;

import java.io.Serializable;

class Student implements Serializable {
    private String name;
    private String roll;
    private String mail;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Student(String name, String roll, String mail, String phone) {
        this.name = name;
        this.roll = roll;
        this.mail = mail;
        this.phone = phone;
    }
}
