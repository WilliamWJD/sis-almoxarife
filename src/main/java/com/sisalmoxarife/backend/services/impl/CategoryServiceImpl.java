package com.sisalmoxarife.backend.services.impl;

import com.sisalmoxarife.backend.domain.Category;
import com.sisalmoxarife.backend.repositories.CategoryRepository;
import com.sisalmoxarife.backend.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
}
