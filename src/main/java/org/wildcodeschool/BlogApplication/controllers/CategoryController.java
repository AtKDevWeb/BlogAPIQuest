package org.wildcodeschool.BlogApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.wildcodeschool.BlogApplication.models.Category;
import org.wildcodeschool.BlogApplication.models.repository.CategoryReposirtory;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private Category categoryReposirtory;
    //Methode CRUD

    //Create
    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        Category savedCategory = categoryReposirtory.save(category);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCategory);
    }
    //Read All
    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categorys = categoryReposirtory.findAll();
        if (categorys.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(categorys);
    }
    //Read One
    @GetMapping ("{/id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable int id) {
        Category category = getAllCategories.findById(id).orElse(null);
        if (category == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(category);
    }
    //Update One
    @PutMapping ("{/id}")
    public ResponseEntity<Category> updateCategory(@PathVariable Long id, @RequestBody Category categoryDetails) {
        Category category = categoryReposirtory.findById(id).orElse(null);
        if (category == null) {
            return ResponseEntity.notFound().build();
        }
        category.setName(category.getName());
    }
    //Delete
    @DeleteMapping ("{/id}")
}




