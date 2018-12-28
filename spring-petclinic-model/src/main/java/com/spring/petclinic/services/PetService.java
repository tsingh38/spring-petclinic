package com.spring.petclinic.services;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.spring.petclinic.model.Owner;
import com.spring.petclinic.model.Pet;

@Service
public interface PetService extends CrudService<Pet, Long> {


}
