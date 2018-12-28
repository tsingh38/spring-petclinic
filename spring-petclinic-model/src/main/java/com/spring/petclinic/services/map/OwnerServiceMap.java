package com.spring.petclinic.services.map;

import java.util.Set;
import org.springframework.stereotype.Service;

import com.spring.petclinic.model.Owner;
import com.spring.petclinic.services.CrudService;
import com.spring.petclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long>  implements OwnerService{


	@Override
	public Owner save(Owner object) {
			super.save(object);
		return object;
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
		  
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		
	}
	}




