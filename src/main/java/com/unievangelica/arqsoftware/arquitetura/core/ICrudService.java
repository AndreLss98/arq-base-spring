package com.unievangelica.arqsoftware.arquitetura.core;

import java.util.List;
import java.util.Optional;

public interface ICrudService<T> {
    public List<T> findAll();
    public Optional<T> findById(long id);
    public T save(T obj);
    public T update(T obj);
    public boolean delete(long id);
    public boolean exist(long id);
}