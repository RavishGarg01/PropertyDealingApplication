package com.property.dealer.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.dealer.Entity.Customer;
import com.property.dealer.Repositories.CustomerRepo;


@Service
public class CustomerServices {
	
	@Autowired
    private CustomerRepo customerRepo;
	
	//Get all Customer
	
	public List<Customer> getAllCustomer(){
		
		return this.customerRepo.findAll();
		
	}
	
	//Add Customer
	
	public Customer addCustomer(Customer customer) {
		
		return this.customerRepo.save(customer);
		
	}
    
    

}
