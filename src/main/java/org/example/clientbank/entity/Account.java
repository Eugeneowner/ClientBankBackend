package org.example.clientbank.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.example.clientbank.enums.Currency;

import java.util.UUID;

import static lombok.AccessLevel.PRIVATE;

@EqualsAndHashCode(callSuper = true)
@Data

@ToString(exclude = "customer")
public class Account extends AbstractEntity {
    private Long id;
    private final String number;
    private Currency currency;
    private Double balance;
    @JsonIgnore
    private Customer customer;

    public Account(Currency currency, Customer customer) {
        this.id = null;
        this.number = UUID.randomUUID().toString();
        this.currency = currency;
        this.balance = 0.0;
        this.customer = customer;
    }
}
