package com.property.dealer.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.property.dealer.Entity.Seller;

public interface SellerRepo extends MongoRepository<Seller,Integer> {
   
	public List<Seller> findByAddressContainingIgnoreCase(String Keyword);
	
	public Optional<Seller> findByPhone(String phone);
}
