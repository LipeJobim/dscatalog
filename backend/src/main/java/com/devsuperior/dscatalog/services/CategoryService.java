package com.devsuperior.dscatalog.services;


import com.devsuperior.dscatalog.dto.categoryDto;
import com.devsuperior.dscatalog.repositories.CategoryRepository;
import com.devsuperior.dscatalog.services.Exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dscatalog.entities.Category;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
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
    @Transactional(readOnly = true)
    public categoryDto findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        Category entity = obj.orElseThrow(() -> new EntityNotFoundException("não encontrado"));
        return new categoryDto(entity);
    }

    @Transactional
    public categoryDto insert(categoryDto dto) {
        Category entity = new Category();
        entity.setName(dto.getName());
        entity = repository.save(entity);
        return new categoryDto (entity);
    }
}
