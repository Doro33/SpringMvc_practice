package ir.maktab.hospital.base.service;
import ir.maktab.hospital.exception.InvalidIdException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public class BaseServiceImpl<E, R extends JpaRepository<E,Long>> implements BaseService<E>{
    protected final R repository;

    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public E saveOrUpdate(E e) {
        return repository.save(e);
    }

    @Override
    public void delete(E e) {
        repository.delete(e);
    }

    @Override
    public E findById(Long id) {
        return repository.findById(id).orElseThrow(()-> new InvalidIdException("This id is not valid."));
    }

    @Override
    public List<E> findAll() {
        return repository.findAll();
    }
}
