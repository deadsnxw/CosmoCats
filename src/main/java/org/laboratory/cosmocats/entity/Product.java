package org.laboratory.cosmocats.entity;

import com.sun.istack.NotNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.lab1.cosmocats.validation.CosmicWordCheck;

@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @CosmicWordCheck
    private String name;

    @NotNull
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
