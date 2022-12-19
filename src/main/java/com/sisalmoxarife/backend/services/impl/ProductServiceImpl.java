package com.sisalmoxarife.backend.services.impl;

import com.sisalmoxarife.backend.dto.product.ProductInputDto;
import com.sisalmoxarife.backend.dto.product.ProductResponseDto;
import com.sisalmoxarife.backend.mapper.ProductMapper;
import com.sisalmoxarife.backend.repositories.ProductRepository;
import com.sisalmoxarife.backend.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public ProductResponseDto saveProduct(final ProductInputDto productInputDto) {
        return productMapper.convertProductEntityInProductResponseDto(productRepository.save(productMapper.convertProductInputDtoInProduct(productInputDto)));
    }
}
