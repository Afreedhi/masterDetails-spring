package com.master.details.model;

import org.springframework.data.mongodb.core.index.Indexed;

public class Master {
    @Indexed(unique = true)
    private String masterNo;
    private String masterDate;
    private String masterStatus;
    private String customerName;

    public String getMasterNo() {
        return masterNo;
    }

    public void setMasterNo(String masterNo) {
        this.masterNo = "1000";
    }

    public String getMasterDate() {
        return masterDate;
    }

    public void setMasterDate(String masterDate) {
        this.masterDate = masterDate;
    }

    public String getMasterStatus() {
        return masterStatus;
    }

    public void setMasterStatus(String masterStatus) {
        this.masterStatus = masterStatus;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
