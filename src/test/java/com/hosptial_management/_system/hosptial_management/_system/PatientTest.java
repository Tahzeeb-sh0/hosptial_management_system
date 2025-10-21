package com.hosptial_management._system.hosptial_management._system;

import com.hosptial_management._system.hosptial_management._system.Entity.Patient;
import com.hosptial_management._system.hosptial_management._system.Repo.PatientRepo;
import com.hosptial_management._system.hosptial_management._system.Service.PatientService;
import lombok.ToString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@SpringBootTest
@ToString
public class PatientTest {

    @Autowired
    private PatientRepo patientRepo;

    @Autowired
    private PatientService patientService;

    @Test
    public void testParientRepo(){
      List<Patient>  patientList = patientRepo.findAll();
        System.out.println("list ______"+patientList);
    }

    @Test
    @Transactional
    public void testTransactionMethod(){
/*
        Patient p1 =  patientService.getPatientById(10l);
        Patient p2 =  patientService.getPatientById(10l);
        System.out.println("------------------------");

        p2.setName("xyz");
        System.out.println("------------------------");
        System.out.println(p1 == p2);
*/
//
//        List<Patient> listedData = patientRepo.findByNameOrDisease("John Doe","guptRog");
//        System.out.println("data_____"+listedData);
//
//        List<Patient> queryData = patientRepo.findByNameContaining("ma");
//        System.out.println("find by name containing query-------"+queryData);

//
//        Patient jpaQueryData = patientRepo.findByBloodGroup(BloodGroupType.valueOf("B_positive"));
//        System.out.println("finded by bloodGroup--------"+jpaQueryData);


//        int updatedData = patientRepo.updateNameWithId("Tahzeeb",17l);
//        System.out.println("updated data-------------"+updatedData);

//        List<Patient> allPatientData = patientRepo.findAllPatient();
//        System.out.println("All Patient Data are listed-----"+allPatientData);


        Page<Patient> allData = patientRepo.findAllPatient(PageRequest.of(0,3));

        for(
                Patient patient : allData
        )System.out.println("Patient:-"+patient);

    }


}
