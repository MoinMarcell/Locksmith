package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("companies")
public record Company(
    @Id
    String id,
    String name,
    List<User> employees,
    String email,
    String phoneNumber,
    List<User> customers,
    List<Product> product,
    Address address
) {
}
