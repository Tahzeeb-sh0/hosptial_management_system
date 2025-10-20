package com.hosptial_management._system.hosptial_management._system.Controller;

import com.hosptial_management._system.hosptial_management._system.Entity.Patient;
import com.hosptial_management._system.hosptial_management._system.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
@RequestMapping("/api")
public class PatientController {

    @Autowired
    private PatientService patientService;
    private Object ResponseEntity;

    @PostMapping("/patient")
    public Patient addPatient(@RequestBody Patient patient){

        return patientService.savePatient(patient);
    }

    @GetMapping("/patient")
    public ResponseEntity<List<Patient>> getAllPatient(){
        List<Patient> data = patientService.getPatient();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
