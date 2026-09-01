package org.coffeeshop.coffeeshopproject.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LoyaltyTransaction {
    private Long id;

    private Long Customerid;

    private Long orderId;

    private Short points;

    private String Type;

    private LocalDateTime createdAt;

}
