package com.unievangelica.arqsoftware.arquitetura.core;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

@Service
public class CrudService<T> implements ICrudService<T> {
        
    @Autowired
    public JpaRepository<T, Long> repository;

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<T> findById(long id) {
        Optional<T> entity = repository.findById(id);
        return entity;
    }

    @Override
    public T save(T obj) {
        return repository.save(obj);
    }

    @Override
    public T update(T obj) {
        return repository.save(obj);
    }

    @Override
    public boolean delete(long id) {
        Optional<T> obj = this.findById(id);
        if (obj.isPresent()) {
            repository.delete(obj.get());
            return true;
        }
        return false;
    }

    @Override
    public boolean exist(long id) {
        return repository.existsById(id);
    }
}