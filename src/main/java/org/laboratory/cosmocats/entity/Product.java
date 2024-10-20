package org.laboratory.cosmocats.entity;

import org.laboratory.cosmocats.validation.CosmicWordCheck;
import javax.validation.constraints.NotNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Min;

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
    @Min(0)
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }
}
