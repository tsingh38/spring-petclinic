package org.spring.petclinic.services.map;

import java.util.Set;

import org.spring.petclinic.*;
import org.spring.petclinic.model.Owner;
import org.spring.petclinic.model.Pet;
import org.spring.petclinic.services.CrudService;
import org.spring.petclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long>  implements PetService{


	@Override
	public Pet save(Pet object) {
			super.save(object);
		return object;
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		
	}
	}




