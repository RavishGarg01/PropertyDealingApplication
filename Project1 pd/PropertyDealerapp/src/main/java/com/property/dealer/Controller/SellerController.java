package com.property.dealer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.property.dealer.Dtos.SignupRequest;
import com.property.dealer.Entity.Seller;
import com.property.dealer.Services.SellerServices;

@CrossOrigin(origins="*",allowedHeaders ="*")
@RestController
public class SellerController {

	@Autowired
	private SellerServices sellerservices;
	
	@PostMapping("/seller")
	public ResponseEntity<String> addSeller(@RequestBody Seller seller) {
		 this.sellerservices.addSeller(seller);
		 
		 return new ResponseEntity("User Added Sucessfully",HttpStatus.OK);
		
	}
	
	@GetMapping("/seller/search/{key}")
	public ResponseEntity<List<Seller>> searchSeller(@PathVariable("key") String Key){
		List<Seller> search=this.sellerservices.searchByAddress(Key);
		
		return new ResponseEntity(search,HttpStatus.OK);
	}
	
	
	@GetMapping("/seller")
	public ResponseEntity<List<Seller>> getAll(){
		List<Seller> li = this.sellerservices.getAllSeller();
		
		return new ResponseEntity(li,HttpStatus.OK);
		
	}
	
	@GetMapping("/seller/signup")
	public ResponseEntity<?> signupSeller(@RequestBody SignupRequest request){
		boolean valid=this.sellerservices.signup(request);
		
		if(valid) {
			return  new ResponseEntity("Seller Sign up sucessfully",HttpStatus.OK);
		}else {
			return new ResponseEntity("Signup failed",HttpStatus.NOT_FOUND);
		}
		
		
	}
}
