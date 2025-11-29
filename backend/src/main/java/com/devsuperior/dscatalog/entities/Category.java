package com.devsuperior.dscatalog.entities;

import ch.qos.logback.core.joran.event.SaxEventRecorder;

import java.io.Serializable;
import java.util.Objects;

public class category implements Serializable {


        private Long id;
        private String name;

        public category (){

        }

    public category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        category category = (category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}


