package com.main.service;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
 * Created by zilongye on 14-10-21.
 */
public abstract class BaseServiceImpl<T> implements BaseService<T>{

    public abstract BaseRepository<T,Integer> getRepository();

    public Page<T> findAll(Pageable page){
        return getRepository().findAll(page);
    }

    @Override
    public T create(T entity) {
        return getRepository().save(entity);
    }

    @Override
    public T update(T entity) {
        return getRepository().save(entity);
    }

    @Override
    public T get(int id) {
        return getRepository().findOne(id);
    }

    @Override
    public void delete(int id) {
        try {
            getRepository().delete(id);
        } catch (Exception e) {
            throw new EmptyResultDataAccessException(id);
        }
    }

    public Page<T> findAll(Specification<T> specification,
                           Pageable pageable){
        return getRepository().findAll(specification,pageable);
    }
    public List<T> findAll(Specification<T> specification){
        return getRepository().findAll(specification);
    }
}
