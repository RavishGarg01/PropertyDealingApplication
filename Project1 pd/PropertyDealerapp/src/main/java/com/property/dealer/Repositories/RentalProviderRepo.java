package com.property.dealer.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.property.dealer.Entity.RentalProvider;

public interface RentalProviderRepo extends MongoRepository<RentalProvider,Integer> {

}
