package com.hosptial_management._system.hosptial_management._system.Entity;

import com.hosptial_management._system.hosptial_management._system.Type.BloodGroupType;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(
        name = "patient",
        uniqueConstraints = {
             //   @UniqueConstraint(name = "unique_patient_email",columnNames = {"email"}),
              //  @UniqueConstraint(name = "unique_patient_detaOFbirth",columnNames = {"birthdate"})
        }
)
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;
    private String gender;
    private String address;

    @Column(updatable = false)
    private LocalDate dateOfBirth;
    private long weight;

    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;
    private String disease;
    private String bloodPressure;
    private String oxygenLevel;

    @OneToOne
    private Insurance insurance;

}
