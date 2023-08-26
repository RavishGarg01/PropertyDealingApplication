package com.property.dealer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.property.dealer.Entity.Customer;
import com.property.dealer.Services.CustomerServices;

@CrossOrigin(origins="*",allowedHeaders ="*")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServices customerServices;
	
	
	@PostMapping("/customer")
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer){
		
		this.customerServices.addCustomer(customer);
		
		return new ResponseEntity("Customer added sucessfully",HttpStatus.OK);
		
	}
	
	
	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> getAll(){
		List<Customer> li = this.customerServices.getAllCustomer();
		
		return new ResponseEntity(li,HttpStatus.OK);
	}
	
	
	

}
