package com.property.dealer.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.property.dealer.Entity.Customer;

public interface CustomerRepo extends MongoRepository<Customer,Integer> {
	
	

}
