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
import com.sisalmoxarife.backend.services.exception.NoSuchElementException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final UserService userService;
    private final UserMapper userMapper;

    @Override
    @Transactional
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

    @Override
    public ProductResponseDto findProductById(final Integer productId, final Integer userId) {
        Optional<Product> product = productRepository.findById(productId);
        if(!product.isPresent()){
            throw new NoSuchElementException("Product not found with id: "+productId);
        }
        return productMapper.convertProductEntityInProductResponseDto(product.get(), userService.findUserById(userId));
    }

    @Override
    public void deleteProduct(Integer productId, Integer userId) {
        ProductResponseDto product = findProductById(productId, userId);
        productRepository.deleteById(product.getId());
    }
}
