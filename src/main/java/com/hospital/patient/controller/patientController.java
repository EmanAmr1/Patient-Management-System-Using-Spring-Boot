package com.hospital.patient.controller;


import com.hospital.patient.service.patientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Patients")
public class patientController {


    @Autowired
    private patientService patientService;

    /*@GetMapping("/print-name-str")
    public String printPatientNameStr(){
        return patientService.printName("Amr");
    }*/

    @GetMapping("/print-name-str")
    public ResponseEntity printPatientNameStr(){
        return ResponseEntity.ofNullable(patientService.printName("Amr"))   ;
    }


}
