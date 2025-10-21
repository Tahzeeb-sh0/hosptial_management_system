package com.hosptial_management._system.hosptial_management._system.Entity;

import com.hosptial_management._system.hosptial_management._system.Enum.SpecializationCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SpecializationCategory specialization;

    @Column(nullable = false,unique = true,length = 100)
    private String email;
}
