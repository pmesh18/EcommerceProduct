package dev.prathamesh.EcommerceProducts2024.Mapper;

import dev.prathamesh.EcommerceProducts2024.Dto.ProductResponseDto;
import dev.prathamesh.EcommerceProducts2024.Entity.Product;


public class ProductEntityDtoMapper {

    public static ProductResponseDto convertEntityToProductDto(Product product){
        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setId(product
                .getId());
        productResponseDto.setTitle(product.getTitle());
        productResponseDto.setDescription(product.getDescription());
        productResponseDto.setPrice(product.getPrice());
        productResponseDto.setImage(product.getImage());
        productResponseDto.setRating(product.getRating());

        return productResponseDto;
    }
}
