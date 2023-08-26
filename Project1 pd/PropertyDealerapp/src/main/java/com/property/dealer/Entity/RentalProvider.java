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
@Document
public class RentalProvider {
	
    private int id;
	
	private String name;
	
	private long phone;
	
	private String address;
	
	private String property_type;
	
	private long price;
	
	private String detail;

	
}