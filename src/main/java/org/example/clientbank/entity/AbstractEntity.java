package org.example.clientbank.entity;

import lombok.Data;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PUBLIC;



@Data
public abstract class AbstractEntity {
    public Long id;
}
