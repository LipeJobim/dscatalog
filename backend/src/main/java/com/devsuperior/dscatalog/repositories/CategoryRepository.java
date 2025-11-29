package com.devsuperior.dscatalog.repositories;

import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dscatalog.entities.category;

public interface Categoryrepository extends JpaRepository <category, Long > {
}
