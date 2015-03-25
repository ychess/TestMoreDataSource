package com.main.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
 * Created by zilongye on 14-10-21.
 */
public interface BaseService<T> extends CrudService<T>{

    public Page<T> findAll(Pageable page);

    public Page<T> findAll(Specification<T> specification,
                           Pageable pageable);

    public List<T> findAll(Specification<T> specification);
}
