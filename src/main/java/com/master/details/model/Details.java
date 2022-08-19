package com.master.details.model;

import org.springframework.data.annotation.Id;

public class Details {

    private String serialNo;
    private String measure;
    private String particulars;
    private String quantity;



    private String masterNo;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getParticulars() {
        return particulars;
    }

    public void setParticulars(String particulars) {
        this.particulars = particulars;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getMasterNo() {
        return masterNo;
    }

    public void setMasterNo(String masterNo) {
        this.masterNo = "1000";
    }
}
