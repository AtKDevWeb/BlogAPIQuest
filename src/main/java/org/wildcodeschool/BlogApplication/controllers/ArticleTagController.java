package org.wildcodeschool.BlogApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.wildcodeschool.BlogApplication.models.Article_tag;
import org.wildcodeschool.BlogApplication.models.repository.ArticleTagRepository;

import java.util.List;

@RestController
@RequestMapping("/articles-Tags")
public class ArticleTagController {
    @Autowired
    private ArticleTagRepository articleTagRepository;
    //Methode CRUD

    // Creation
    @PostMapping
    public ResponseEntity<Article_tag> createArticleTag(@RequestBody Article_tag articleTag) {
        Article_tag savedArticleTag = articleTagRepository.save(articleTag);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedArticleTag);
    }
    //Read All
    @GetMapping
    public ResponseEntity<List<Article_tag>> getAllArticlesTags() {
        List<Article_tag> articlesTags = articleTagRepository.findAll();
        if (articlesTags.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(articlesTags);
    }
    //Read On by Id
    @GetMapping("/{id}")
    public ResponseEntity<Article_tag> getArticleById(@PathVariable Long id) {
        Article_tag article = articleTagRepository.findById(id).orElse(null);
        if (article == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(article);
    }
    //Update one by Id
    @PutMapping("/{id}")
    public ResponseEntity<Article_tag> updateArticleTag(@PathVariable Long id, @RequestBody Article_tag articleTagDetails) {
        Article_tag articleTag = articleTagRepository.findById(id).orElse(null);
        if (articleTag == null) {
            return ResponseEntity.notFound().build();
        } else {
            articleTag.setId(articleTagDetails.getImage_id());
            Article_tag updatedArticleTag = articleTagRepository.save(articleTag);
            return ResponseEntity.ok(updatedArticleTag);
        }
    }
    //Delete by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArticleTag(@PathVariable Long id) {
        Article_tag article = articleTagRepository.findById(id).orElse(null);
        if (article == null) {
            return ResponseEntity.notFound().build();
        }
        articleTagRepository.delete(article);
        return ResponseEntity.noContent().build();
    }
}
