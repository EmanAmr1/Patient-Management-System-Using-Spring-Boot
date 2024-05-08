package com.hospital.patient.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class patientModel {

    List<String> names = new ArrayList<>();

    patientModel(){
        names.add("Eman");
        names.add("Amr");
        names.add("Ali");
    }
    public List<String> getPatientFromDB(){
            return names;
    };



}
