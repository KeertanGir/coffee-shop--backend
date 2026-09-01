package org.coffeeshop.coffeeshopproject.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    private String PaymentMethod;

    private String paymentStatus;

    private String transection_id;

    @CreationTimestamp
    private LocalDateTime paid_at;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;


}
