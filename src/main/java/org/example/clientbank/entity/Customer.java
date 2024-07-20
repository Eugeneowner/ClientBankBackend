package org.example.clientbank.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;


@EqualsAndHashCode(callSuper = true)
@Data
public class Customer extends AbstractEntity {
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private List<Account> accounts;

    public Customer(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.accounts = new ArrayList<>();
    }
}
