package com.spring.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.spring.petclinic.model.Owner;
import com.spring.petclinic.model.Vet;
import com.spring.petclinic.services.CrudService;
import com.spring.petclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long>  implements VetService{


	@Override
	public Vet save(Vet object) {
			super.save(object);
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




