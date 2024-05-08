package com.hospital.patient.service;

import org.springframework.stereotype.Service;

@Service
public class patientService {

    public String printName(String name){
        return name.toUpperCase();
    }
}
