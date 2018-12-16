package org.spring.petclinic.services;

import java.util.Set;

interface CommonService<T,ID> {

	Set<T> findAll();
	T findById(ID id);
	T save(T object);
	
	void delete(T object);
	void deleteById(ID id);
}
