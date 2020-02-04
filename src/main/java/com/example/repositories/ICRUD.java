package com.example.repositories;

import java.util.List;

public interface ICRUD<T> {

    List<T> findAll() throws Exception;
    T getById(Integer id) throws Exception;
    void save(T obj);
    void update(T obj, Integer id);
    void deleteById(T obj, Integer id);


}
