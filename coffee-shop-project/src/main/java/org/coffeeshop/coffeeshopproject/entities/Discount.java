package org.coffeeshop.coffeeshopproject.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "discouts")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Code;

    @Column( name = "discount_type")
    private String discountType;

    private String value;

    @Column( name = "minimum_order" , nullable = false)
    private String minimumOrder;

    @Column( name = "start_date" , nullable = false )
    private LocalDate startDate;

    @Column( name = "end_date", nullable = false)
    private LocalDate endDate;

    private Boolean active;

}
