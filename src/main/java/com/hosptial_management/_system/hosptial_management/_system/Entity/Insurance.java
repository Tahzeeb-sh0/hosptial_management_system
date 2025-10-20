package com.hosptial_management._system.hosptial_management._system.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false,unique = true,length = 50)
    private String policyNumber;

    @Column(nullable = false,length = 100)
    private String provider;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
}
