package com.koshailimited.deshdeal.repository;

import com.koshailimited.deshdeal.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
