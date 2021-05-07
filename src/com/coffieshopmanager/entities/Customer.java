package com.coffieshopmanager.entities;

import com.coffieshopmanager.abstracts.Entity;

import java.util.Date;

public class Customer implements Entity {
    private int id;
    private String firstname;
    private String lastname;
    private int birthOfDate;
    private String nationalityId;

    public Customer (int id, String firstname, String lastname, int birthOfDate, String nationalityId){
        super();
        this.id = id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.birthOfDate=birthOfDate;
        this.nationalityId=nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(int birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
