package com.sisalmoxarife.backend.services.impl;

import com.sisalmoxarife.backend.domain.Product;
import com.sisalmoxarife.backend.domain.User;
import com.sisalmoxarife.backend.dto.product.ProductInputDto;
import com.sisalmoxarife.backend.dto.product.ProductResponseDto;
import com.sisalmoxarife.backend.dto.user.ResponseUserDto;
import com.sisalmoxarife.backend.mapper.ProductMapper;
import com.sisalmoxarife.backend.mapper.UserMapper;
import com.sisalmoxarife.backend.repositories.ProductRepository;
import com.sisalmoxarife.backend.services.ProductService;
import com.sisalmoxarife.backend.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final UserService userService;
    private final UserMapper userMapper;

    @Override
    public ProductResponseDto saveProduct(final ProductInputDto productInputDto, final Integer userId) {
        User user = userMapper.mapperDtoForEntity(userService.findUserById(userId));
        Product product = productRepository.save(productMapper.convertProductInputDtoInProduct(productInputDto, user));
        return productMapper.convertProductEntityInProductResponseDto(product, userMapper.mapperEntityForResponseUserDto(product.getUser()));
    }

    @Override
    public List<ProductResponseDto> listAllProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductResponseDto> productsResponse = new ArrayList<>();

        for(Product product: products){
            ResponseUserDto userDto = userMapper.mapperEntityForResponseUserDto(product.getUser());
            productsResponse.add(productMapper.convertProductEntityInProductResponseDto(product, userDto));
        }

        return productsResponse;
    }
}
