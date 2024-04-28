package com.explorenest.servicio.controller;

import com.explorenest.servicio.domain.Service;
import com.explorenest.servicio.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/servicios")
@CrossOrigin("*")
public class ServiceController {
    @Autowired
    private ServiceService service;

    @GetMapping("list")
    public List<Service> getServices() {
        return service.getServices();
    }
    @GetMapping("get")
    public Service getServiceById(@RequestParam("id") int id) {
        return service.getServiceById(id);
    }
}
