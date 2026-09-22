package org.coffeeshop.coffeeshopproject.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class CustomException {
    private Integer status;

    private String description;

    private LocalDateTime timeStamp;

    private String details;
}
