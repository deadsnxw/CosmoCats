package org.laboratory.cosmocats.mapper;

import org.laboratory.cosmocats.dto.ProductDTO;
import org.laboratory.cosmocats.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO toDTO(Product product);

    Product toEntity(ProductDTO productDTO);
}
