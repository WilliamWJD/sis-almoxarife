package com.sisalmoxarife.backend.repositories;

import com.sisalmoxarife.backend.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
