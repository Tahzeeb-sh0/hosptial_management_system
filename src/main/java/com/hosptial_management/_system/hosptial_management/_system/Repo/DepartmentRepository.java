package com.hosptial_management._system.hosptial_management._system.Repo;

import com.hosptial_management._system.hosptial_management._system.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}