package ir.maktab.hospital.base.service;

import java.util.List;

public interface BaseService<E>{
    E saveOrUpdate(E e);
    void delete(E e);
    E findById(Long id);
    List<E> findAll();
}
