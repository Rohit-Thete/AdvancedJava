package exampleStudent;

import java.util.Collection;

public interface StudDaoJdbc <T,K> {
	// READ
		Collection<T> getAll(); // Get All the objects of the specific type.
		T getOne(K key); // Get one object of specific type based upon its identity.
		
		//CREATE
		void add(T t); // Add a new record into existing table

		//UPDATE
		void update(T t); // Update the existing Record
		
		//DELETE
		void delete(T key); // Delete the specific record against its identity

	}


