package com.devsuperior.dscatalog.resources;


import com.devsuperior.dscatalog.entities.category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/categories")
public class categoryResource {

        @RequestMapping
        public ResponseEntity <List<category>> findAll() {
            List<category> list = new ArrayList<>();
            list.add(new category(1L,"Books"));
            list.add(new category(1L,"Eletronics"));
            return ResponseEntity.ok().body(list);
        }

}
