package com.hosptial_management._system.hosptial_management._system.Repo;

import com.hosptial_management._system.hosptial_management._system.Entity.Patient;
import com.hosptial_management._system.hosptial_management._system.Type.BloodGroupType;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepo extends JpaRepository<Patient,Long> {


    List<Patient> findByNameOrDisease(String johnDoe, String guptRog);
    List<Patient> findByNameContaining(String query);

    @Query("SELECT p FROM Patient p WHERE p.bloodGroup=:bloodGroup")
    Patient findByBloodGroup(@Param("bloodGroup") BloodGroupType bloodGroup);

    @Query(value = "SELECT * FROM patient",nativeQuery = true)
    Page<Patient> findAllPatient(Pageable pageable);

    @Transactional
    @Modifying
    @Query("UPDATE Patient p SET p.name = :name WHERE p.id = :id")
    int updateNameWithId(@Param("name") String name, @Param("id") long id);






}
