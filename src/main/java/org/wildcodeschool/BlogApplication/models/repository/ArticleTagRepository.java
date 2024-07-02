package org.wildcodeschool.BlogApplication.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.BlogApplication.models.Article_tag;

public interface ArticleTagRepository extends JpaRepository<Article_tag, Long> {
}
