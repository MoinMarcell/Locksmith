package com.github.moinmarcell.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("users")
public record User(
        @Id
        String id,
        String firstname,
        String lastname,
        String username,
        String password,
        String email,
        List<Company> companies
) {
}
