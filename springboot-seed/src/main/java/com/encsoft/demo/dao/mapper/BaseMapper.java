package com.encsoft.demo.dao.mapper;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T> {

    T get(Serializable id);

    List<T> find();

    List<T> findByIds(List<Serializable> ids);

    void insert(T model);

    void batchInsert(List<T> models);

    int update(T model);

    void delete(Serializable id);

    void deleteByUuid(Serializable uuid);

    void delete(T model);

    void batchDelete(List<T> models);

}
