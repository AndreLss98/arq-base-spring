package com.unievangelica.arqsoftware.arquitetura.core;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

public class CrudController<T> {
        
    @Autowired
    protected CrudService<T> service;

    @GetMapping
    public ResponseEntity<List<T>> listAll() {
        return new ResponseEntity<List<T>>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<T> save( @RequestBody() T obj ){
        return new ResponseEntity<T>(service.save(obj), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody T obj) {
        return new ResponseEntity<>(service.update(obj), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}