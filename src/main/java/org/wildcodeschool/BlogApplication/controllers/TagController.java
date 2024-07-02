package org.wildcodeschool.BlogApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wildcodeschool.BlogApplication.models.repository.TagRepository;

@RestController
@RequestMapping("/tags")
public class TagController {
    @Autowired
    private TagRepository tagRepository;
    //Methode CRUD
}
