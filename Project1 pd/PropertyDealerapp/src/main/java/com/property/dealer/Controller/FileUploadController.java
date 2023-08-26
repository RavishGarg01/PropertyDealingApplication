package com.property.dealer.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.property.dealer.Helper.FileUploadHelper;
import com.property.dealer.Repositories.SellerRepo;

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
public class FileUploadController {
	
	@Autowired
	FileUploadHelper uploadHelper;
	
	@Autowired
	SellerRepo drepo;
	
    @PostMapping("seller/uploadImg")
	public String UploadImage(@RequestParam("file") MultipartFile file){
    	
           
          System.out.println(file.getOriginalFilename());
          System.out.println(file.getContentType());
    	
    	try {
    		if(file.isEmpty()) {
    			return "File is empty";
    		}
    		
    		 boolean f=this.uploadHelper.UploadFile(file);
    		 
    		 if(f) {
    			 
//    		 Optional<Seller> d=this.drepo.findById(id);
//    		 
//    		 Seller d1=d.get();
//    		 
//    		 d1.setImage(file.getOriginalFilename());
//    		 
//    		 this.drepo.save(d1);
    		 
    		 
    		 return ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(file.getOriginalFilename()).toUriString();
    		 
    		 
    		 }else {
    			 return "An error occured";
    		 }
    		
    	
    	
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
        return "working";
//    	
//    	
//		
//		
	}

}
