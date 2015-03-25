package com.main.service;


public interface CrudService<T> {
    T create(T entity);
    T update(T entity);
    T get(int id);
    void delete(int id);
}
