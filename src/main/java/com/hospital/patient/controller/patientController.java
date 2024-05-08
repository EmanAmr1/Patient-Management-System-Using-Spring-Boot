package com.hospital.patient.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class patientController {

    @GetMapping("/print-name")
    public void printPatientName(){

        System.out.println("MY NAME");

    }
}
