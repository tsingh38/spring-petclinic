package org.spring.petclinic.services.map;

import java.util.Set;

import org.spring.petclinic.*;
import org.spring.petclinic.model.Owner;
import org.spring.petclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner,Long>  implements CrudService<Owner,Long>{


	@Override
	public Owner save(Owner object) {
			super.save(object.getId(), object);
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




