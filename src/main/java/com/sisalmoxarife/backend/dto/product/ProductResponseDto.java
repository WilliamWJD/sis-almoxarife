package com.sisalmoxarife.backend.dto.product;

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
}
