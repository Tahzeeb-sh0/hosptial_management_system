package com.hosptial_management._system.hosptial_management._system.Service;

import com.hosptial_management._system.hosptial_management._system.Entity.Patient;
import com.hosptial_management._system.hosptial_management._system.Repo.PatientRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepo patientRepo;

    public Patient getPatientById(long id){
        Patient p1 = patientRepo.findById(id).orElse(null);
        Patient p2 = patientRepo.findById(id).orElse(null);

        return p1;
    }

    public Patient savePatient(Patient patient) {

        return patientRepo.save(patient);
    }

    public List<Patient> getPatient() {
         List<Patient> data =  patientRepo.findAll();
         return data;
    }
}

