package com.devsuperior.dscatalog.services;


import com.devsuperior.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dscatalog.entities.category;
import java.util.List;

@Service
public class CetegoryService {

    @Autowired
    public CategoryRepository repository;

    public List<category> findAll() {
        return repository.findAll();
    }
}



