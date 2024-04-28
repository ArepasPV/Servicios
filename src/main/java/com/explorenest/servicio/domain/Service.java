package com.explorenest.servicio.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Service {
    @Id
    private Integer id;
    private Integer space;
    private String type;
}