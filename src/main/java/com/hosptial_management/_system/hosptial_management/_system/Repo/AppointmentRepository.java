package com.hosptial_management._system.hosptial_management._system.Repo;

import com.hosptial_management._system.hosptial_management._system.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}