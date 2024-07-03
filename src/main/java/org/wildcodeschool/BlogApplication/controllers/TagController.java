package org.wildcodeschool.BlogApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.wildcodeschool.BlogApplication.models.Tag;
import org.wildcodeschool.BlogApplication.models.repository.TagRepository;

import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagController {
    @Autowired
    private TagRepository tagRepository;

    //Methode CRUD
    //Create
    @PostMapping
    public ResponseEntity<Tag> createTag(@RequestBody Tag tag) {
        Tag savedTag = tagRepository.save(tag);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTag);
    }
    //Read All
    @GetMapping
    public ResponseEntity<List<Tag>> getAllTags() {
        List<Tag> tags = tagRepository.findAll();
        if (tags.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(tags);
    }
    //Read One
    @GetMapping("{/id}")
    public ResponseEntity<Tag> getTag(@PathVariable long id) {
        Tag tag = tagRepository.findById(id).orElse(null);
        if (tag == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tag);
    }
    //Update One
    @PutMapping("{/id}")
    public ResponseEntity<Tag> updateTag(@PathVariable long id, @RequestBody Tag updateTag) {
        Tag tag = tagRepository.findById(id).orElse(null);
        if (tag == null) {
            return ResponseEntity.notFound().build();
        } else {
            tag.setName(updateTag.getName());
            return ResponseEntity.ok(updateTag);
        }
    }
    //Delete
    @DeleteMapping("{/id}")
    public ResponseEntity<Tag> deleteTag(@PathVariable long id) {
        Tag tag = tagRepository.findById(id).orElse(null);
        if (tag == null) {
            return ResponseEntity.notFound().build();
        }
        tagRepository.delete(tag);
        return ResponseEntity.noContent().build();
    }
}

