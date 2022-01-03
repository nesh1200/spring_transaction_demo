package com.example.SpringTransactionDemo.model;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Account {
    private long id;
    private String name;
    private BigDecimal amount;
}
