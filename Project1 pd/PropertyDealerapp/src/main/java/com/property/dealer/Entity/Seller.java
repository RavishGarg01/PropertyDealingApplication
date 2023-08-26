package com.property.dealer.Entity;




import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection="Seller")
public class Seller {
	
	
	
	
	private String name;
	
	private String email;
	
	private String phone;
	
	private String address;
	
	private String propertyType;
	
	private String image; 

}
