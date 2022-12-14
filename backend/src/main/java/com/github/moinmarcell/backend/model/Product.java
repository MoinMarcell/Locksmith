package com.github.moinmarcell.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document("products")
public record Product(
        @Id
        String id,
        String name,
        String description,
        BigDecimal price
) {
}
