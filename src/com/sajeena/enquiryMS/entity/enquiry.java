/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.enquiryMS.entity;

/**
 *
 * @author Admin
 */
public class enquiry {
      private int id;
    private String enquiryname,description;
    private boolean status;

    public enquiry() {
    }

    public enquiry(int id, String enquiryname, String description, boolean status) {
        this.id = id;
        this.enquiryname = enquiryname;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnquiryname() {
        return enquiryname;
    }

    public void setEnquiryname(String enquiryname) {
        this.enquiryname = enquiryname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
