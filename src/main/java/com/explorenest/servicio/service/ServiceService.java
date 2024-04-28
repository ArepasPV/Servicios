package com.explorenest.servicio.service;

import com.explorenest.servicio.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.explorenest.servicio.domain.Service;

import java.util.List;
@org.springframework.stereotype.Service
public class ServiceService {
    @Autowired
    private ServiceRepository repository;

    public List<Service> getServices(){
        return repository.findAll();
    }

    public Service getServiceById(int id){
        return repository.findByOneById(id);
    }
}
