package org.spring.petclinic.services.map;

import java.util.Set;

import org.spring.petclinic.*;
import org.spring.petclinic.model.Owner;
import org.spring.petclinic.model.Vet;
import org.spring.petclinic.services.CrudService;
import org.spring.petclinic.services.VetService;

public class VetServiceMap extends AbstractMapService<Vet,Long>  implements VetService{


	@Override
	public Vet save(Vet object) {
			super.save(object.getId(), object);
		return object;
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		
	}
	}




