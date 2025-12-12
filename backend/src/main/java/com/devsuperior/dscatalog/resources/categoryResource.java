package com.devsuperior.dscatalog.resources;


import com.devsuperior.dscatalog.dto.categoryDto;
import com.devsuperior.dscatalog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import javax.xml.xpath.XPathVariableResolver;
import java.net.URI;
import java.util.List;


@RestController
@RequestMapping(value = "/categories")
public class categoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity <List<categoryDto>> findAll() {
        List<categoryDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity <categoryDto>findById(@PathVariable Long id) {
        categoryDto dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public  ResponseEntity<categoryDto> insert(@RequestBody categoryDto dto){
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);

    }


}
