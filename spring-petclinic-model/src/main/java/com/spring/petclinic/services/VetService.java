package com.spring.petclinic.services;

import org.springframework.stereotype.Service;

import com.spring.petclinic.model.Vet;

@Service
public interface VetService extends CrudService<Vet, Long> {


}
