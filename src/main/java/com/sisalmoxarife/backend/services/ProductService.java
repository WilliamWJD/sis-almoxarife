package com.sisalmoxarife.backend.services;

import com.sisalmoxarife.backend.dto.product.ProductInputDto;
import com.sisalmoxarife.backend.dto.product.ProductResponseDto;

import java.util.List;

public interface ProductService {
    ProductResponseDto saveProduct (final ProductInputDto productInputDto, final Integer userId);
    List<ProductResponseDto> listAllProducts();
}
