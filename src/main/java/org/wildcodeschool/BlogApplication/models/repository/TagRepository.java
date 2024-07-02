package org.wildcodeschool.BlogApplication.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.BlogApplication.models.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
