package com.property.dealer.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.dealer.Entity.RentalProvider;
import com.property.dealer.Repositories.RentalProviderRepo;

@Service
public class RentalProviderService {
	
	@Autowired
	RentalProviderRepo provider;
	
	public RentalProvider createProvider(RentalProvider p) {
		
		return this.provider.save(p);
		
	}

}
