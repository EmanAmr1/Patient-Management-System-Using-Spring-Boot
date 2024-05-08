package com.hospital.patient.service;

import com.hospital.patient.model.patientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class patientService {
    @Autowired
    private  patientModel patientModel;


    public String printName(String name){
        String n =patientModel.getPatientFromDB().stream().filter(i->i ==name).findAny().orElse("Nothing");
        return n.toUpperCase();
    }


}
