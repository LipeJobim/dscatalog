package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.entities.Category;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class categoryDto implements Serializable {


    private Long id;
    private String name;

    public categoryDto (){

    }
    public categoryDto (Long id, String name){
        this.id = id;
        this.name = name;
    }

    public categoryDto (Category entity){
        this.id = entity.getId();
        this.name = entity.getName();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
