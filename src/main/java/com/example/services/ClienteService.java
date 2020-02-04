package com.example.services;


import com.example.models.Cliente;
import com.example.repositories.ClienteRepository;
import com.example.repositories.ICRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements ICRUD<Cliente> {
    @Autowired
    ClienteRepository repository;


    @Override
    public List<Cliente> findAll() throws Exception {
        return repository.findAll();
    }

    @Override
    public Cliente getById(Integer id) throws Exception {
        return repository.findById(id).get();
    }

    @Override
    public void save(Cliente obj) {

        repository.save(obj);

    }

    @Override
    public void update(Cliente obj, Integer id) {
        obj.setId(id);
        repository.save(obj);
    }

    @Override
    public void deleteById(Cliente obj, Integer id) {
        repository.deleteById(id);
    }
}
