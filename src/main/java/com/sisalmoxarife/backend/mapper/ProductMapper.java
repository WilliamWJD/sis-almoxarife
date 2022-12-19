package com.sisalmoxarife.backend.mapper;

import com.sisalmoxarife.backend.domain.Product;
import com.sisalmoxarife.backend.dto.product.ProductInputDto;
import com.sisalmoxarife.backend.dto.product.ProductResponseDto;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product convertProductInputDtoInProduct(final ProductInputDto productInputDto){
        Product product = new Product();
        product.setName(productInputDto.getName());
        product.setDescription(productInputDto.getDescription());
        product.setStockCurrent(productInputDto.getStockCurrent());
        return product;
    }

    public ProductResponseDto convertProductEntityInProductResponseDto(final Product product){
        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setId(product.getId());
        productResponseDto.setName(product.getName());
        productResponseDto.setDescription(product.getDescription());
        productResponseDto.setStockCurrent(product.getStockCurrent());
        return productResponseDto;
    }
}
