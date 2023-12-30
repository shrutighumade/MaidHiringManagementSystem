package com.anudip.maid.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {
	@Column(name="Line", length=50, nullable=false)
	private String line;
	
	@Column(name="City", length=50, nullable=false)
	private String city;
	
	@Column(name="State", length=50, nullable=false)
	private String state;
	
	@Column(name="Country", length=50, nullable=false)
	private String country;
	
	@Column(name="Pin_Code", length=6, nullable=false)
	private String pinCode;
		

}
