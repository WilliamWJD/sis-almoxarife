package com.sisalmoxarife.backend.services;

import com.sisalmoxarife.backend.dto.product.ProductInputDto;
import com.sisalmoxarife.backend.dto.product.ProductResponseDto;

public interface ProductService {
    ProductResponseDto saveProduct (final ProductInputDto productInputDto, final Integer userId);
}
