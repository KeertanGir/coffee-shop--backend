package org.coffeeshop.coffeeshopproject.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
public class Payment {

    private Long id;

    private String order_id;

    private BigDecimal amount;

    private String PaymentMethod;

    private String paymentStatus;

    private String transection_id;

    @CreationTimestamp
    private LocalDateTime paid_at;

}
