package com.hosptial_management._system.hosptial_management._system.Repo;

import com.hosptial_management._system.hosptial_management._system.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}