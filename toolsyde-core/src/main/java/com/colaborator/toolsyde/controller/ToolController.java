package com.colaborator.toolsyde.controller;

import com.colaborator.toolsyde.model.Tool;
import com.colaborator.toolsyde.repository.ToolRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tools")
public class ToolController {
    private final ToolRepository repository;

    public ToolController(ToolRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<Tool> getAll() {
        return repository.findAll();
    }
}
