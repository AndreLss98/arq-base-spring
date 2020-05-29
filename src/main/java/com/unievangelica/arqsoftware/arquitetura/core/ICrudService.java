package com.unievangelica.arqsoftware.arquitetura.core;

import java.util.List;

public interface ICrudService<T> {
    public List<T> findAll();
    public T findById(long id);
    public T save(T obj);
    public T update(T obj);
    public boolean delete(long id);
    public boolean exist(long id);
}