package com.sisalmoxarife.backend.resources;

import com.sisalmoxarife.backend.dto.product.ProductInputDto;
import com.sisalmoxarife.backend.dto.product.ProductResponseDto;
import com.sisalmoxarife.backend.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductResource {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponseDto> saveProduct(@RequestBody final ProductInputDto productInputDto, @RequestHeader final Integer userId){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.saveProduct(productInputDto, userId));
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDto>> listAllProducts(){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.listAllProducts());
    }
}
