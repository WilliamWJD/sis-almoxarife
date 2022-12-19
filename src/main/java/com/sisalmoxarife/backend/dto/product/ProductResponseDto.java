package com.sisalmoxarife.backend.dto.product;

import com.sisalmoxarife.backend.domain.Category;
import com.sisalmoxarife.backend.dto.user.ResponseUserDto;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductResponseDto {
    private Integer id;
    private String name;
    private String description;
    private Integer stockCurrent;
    private ResponseUserDto userDto;
    private List<Category> categories;
}
