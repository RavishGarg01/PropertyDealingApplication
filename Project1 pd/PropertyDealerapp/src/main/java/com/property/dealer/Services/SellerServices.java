package com.property.dealer.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.property.dealer.Dtos.SignupRequest;
import com.property.dealer.Entity.Seller;
import com.property.dealer.Repositories.SellerRepo;


@Service
public class SellerServices {
	
	@Autowired
	private SellerRepo sr;
	
	//Add a Seller
	
	public Seller addSeller(Seller seller) {
		Seller saved= this.sr.save(seller);
		
		return saved;
	}
	
	
	
	//Search seller
	
    public List<Seller> searchByAddress(String Keyword) {
    	return this.sr.findByAddressContainingIgnoreCase(Keyword);
    	
    }
    
    
    
    //Get all seller
    
    public List<Seller> getAllSeller(){
    	return this.sr.findAll();
    }
    
    
    
    
    //Signup Seller
    
    public boolean signup(SignupRequest request) {
    	
    	String Phone=request.getPhone();
    	
    	 Optional<Seller> found=this.sr.findByPhone(Phone);
    	 
    	 if(found.isPresent()) {
    		 Seller s1=found.get();
    		 if(s1.getEmail().equals(request.getEmail())) {
        		 return true;
    		 }else {
        		 return false;
        	 }
    	 }
    	 else {
    		 return false;
    	 }
    	 
    	 
    	 
    	
    	
    	
    	
    }
    
   
	
	

}
