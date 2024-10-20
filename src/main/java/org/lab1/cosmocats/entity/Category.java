package org.lab1.cosmocats.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Category(String name) {
        this.name = name;
    }
}
