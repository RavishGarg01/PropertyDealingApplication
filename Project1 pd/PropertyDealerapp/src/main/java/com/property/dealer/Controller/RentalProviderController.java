package com.property.dealer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.property.dealer.Entity.RentalProvider;
import com.property.dealer.Services.RentalProviderService;

@RestController
public class RentalProviderController {
	
	@Autowired
	RentalProviderService rps;
	
	@PostMapping("/rentalprovider")
	public RentalProvider addProvider(@RequestBody RentalProvider provider) {
		return this.rps.createProvider(provider);
	}

}
