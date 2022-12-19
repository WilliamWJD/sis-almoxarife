package com.sisalmoxarife.backend.repositories;

import com.sisalmoxarife.backend.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
