package org.spring.petclinic.services;

import java.util.Set;

import org.spring.petclinic.model.Owner;
import org.spring.petclinic.model.Pet;
import org.springframework.stereotype.Service;

@Service
public interface PetService extends CrudService<Pet, Long> {


}
