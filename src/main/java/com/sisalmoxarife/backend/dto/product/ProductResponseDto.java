package com.sisalmoxarife.backend.dto.product;

import com.sisalmoxarife.backend.dto.user.ResponseUserDto;
import lombok.*;

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
}
