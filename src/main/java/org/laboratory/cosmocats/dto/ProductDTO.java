package org.laboratory.cosmocats.dto;

import org.laboratory.cosmocats.validation.CosmicWordCheck;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private Long id;

    @NotNull
    @CosmicWordCheck
    private String name;

    @NotNull
    @Min(0)
    private Double price;

    public ProductDTO(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}
