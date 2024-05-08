package com.hospital.patient.service;

import com.hospital.patient.model.patient;
import com.hospital.patient.model.patientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class patientService {
    @Autowired
    private  patientModel patientModel;

    /*public String printName(String name){
        String n =patientModel.getPatientFromDB().stream().filter(i->i ==name).findAny().orElse("Nothing");
        return n.toUpperCase();
    }*/

    public patient printName(String name){
        String n =patientModel.getPatientFromDB().stream().filter(i->i ==name).findAny().orElse("Nothing");
        patient p =new patient();
        p.setName(n.toUpperCase());
        return p;
    }



    public List<patient> getPatients(){
        ArrayList<patient> list = new ArrayList<patient>();
        patientModel.getPatientFromDB().forEach(name -> list.add(new patient(name)));
        return list;
    }



}
