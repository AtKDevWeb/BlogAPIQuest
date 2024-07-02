package org.wildcodeschool.BlogApplication.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.BlogApplication.models.Category;

public interface CategoryReposirtory extends JpaRepository<Category, Long> {
}
