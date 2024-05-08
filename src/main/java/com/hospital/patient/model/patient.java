package com.hospital.patient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class patient {

    @JsonProperty("fname")
    private String name;

    @JsonProperty("lname")
    private String lname;

    public patient() {
    }

    public patient(String name) {
        this.name = name;
    }

    public patient(String name, String lname) {
        this.lname = lname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
