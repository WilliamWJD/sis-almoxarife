package com.sisalmoxarife.backend.dto.product;

import com.sisalmoxarife.backend.domain.Category;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductInputDto {
    private Integer id;
    private String name;
    private String description;
    private Integer stockCurrent;
    private List<Category> categories;
}
