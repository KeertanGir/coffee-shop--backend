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

    @Column( name = "payment_method" , nullable = false)
    private String PaymentMethod;

    @Column( name = "payment_status" , nullable = false)
    private String paymentStatus;

    @Column( name = "transection_id")
    private String transectionId;

    @CreationTimestamp
    @Column( name = "paid_at" , nullable = false )
    private LocalDateTime paidAt;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;


}
