package com.colaborator.toolsyde.controller;

import com.colaborator.toolsyde.model.Category;
import com.colaborator.toolsyde.repository.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryRepository repository;

    public CategoryController(CategoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<Category> getAll() {
        return repository.findAll();
    }
}
