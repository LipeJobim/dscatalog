package com.devsuperior.dscatalog.services;


import com.devsuperior.dscatalog.dto.categoryDto;
import com.devsuperior.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dscatalog.entities.Category;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<categoryDto> findAll() {
        List<Category> list = repository.findAll();

        return list.stream().map(x -> new categoryDto(x)).collect(Collectors.toList());

    }
}
