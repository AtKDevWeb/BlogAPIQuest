package org.wildcodeschool.BlogApplication.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.BlogApplication.models.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
