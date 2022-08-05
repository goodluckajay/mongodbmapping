package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Document(collection = "order_db")
public class User {
    @Id
    private int id;
    private String name;
    private String gender;
    private List<Product> products;
    private Address address;

}
