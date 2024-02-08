package com.bookStore.service;

import java.util.List;
import com.bookStore.entity.Category;
import com.bookStore.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    // Additional methods (save, delete, etc.)
}
