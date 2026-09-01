package org.coffeeshop.coffeeshopproject.entities;

import java.time.LocalDate;

public class Discount {
    private Long id;

    private String Code;

    private String discountType;

    private String value;

    private String minimumOrder;

    private LocalDate startDate;

    private LocalDate endDate;

    private Boolean active;

}
