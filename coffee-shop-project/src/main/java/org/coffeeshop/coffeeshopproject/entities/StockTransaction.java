package org.coffeeshop.coffeeshopproject.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class StockTransaction {

    private Long id;

    private Long inventoryItemId;

    private String Type;

    private String Quantity;

    private String reference;

    private LocalDateTime created_at;
}
