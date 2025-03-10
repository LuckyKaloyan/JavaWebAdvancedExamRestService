package com.model;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;


@Data
@Builder
public class Product {

    private UUID id;
    private String name;
    private int quantity;

}
