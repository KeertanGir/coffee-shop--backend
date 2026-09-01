package org.coffeeshop.coffeeshopproject.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String role;

    private BigDecimal Salary;

    private LocalDateTime joiningDate;

    private Boolean active;

    @OneToMany(
            mappedBy = "employee",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Shift> shifts;
}
