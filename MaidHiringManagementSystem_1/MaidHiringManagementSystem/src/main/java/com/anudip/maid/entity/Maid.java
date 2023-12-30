package com.anudip.maid.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("MAID")
public class Maid extends User {

	@Column(name= "Name", nullable=false, length=30)	
	private String name;
	
	@Column(name= "Gender", nullable=false, length=7)
	private String gender;
  	
	@Column(name= "Age", nullable=false, length=2)
	private String age;
	
	@Column(name= "Location", nullable=false, length=30)
	private String location;
	
	@Column(name= "Working_Time", nullable=false, length=10)
	private String workingTime;
	
	@Column(name= "Experience", nullable=false, length=2)
	private int experienceYears;
	
	@Column(name= "Salary_Expectation", nullable=false, length=7)
	private double expectedSalary;
	
	@Column(name= "Native_Place", nullable=false, length=30)
	private String nativePlace;
	
	@Column(name= "Preferred_City", nullable=false, length=30)
	private String preferredCity;
	
	@Column(name= "Marrital_Status", nullable=false, length=10)
	private String maritalStatus;
	
	@Column(name= "Religion", nullable=false, length=10)
	private String religion;
	
	@Column(name= "Education", nullable=false, length=30)
	private String education;
	
	@Column(name= "Languages", nullable=false, length=50)
	private String languages;
	
	@Column(name= "Vaccination", nullable=false, length=30)
	private String vaccination;
	
	@Column(name="Pet_Friendly", nullable=false, length=3)
	private boolean petFriendly;
	
	//@Enumerated(EnumType.STRING)
	@Column(name= "Availability", nullable=false, length=10)
	private String availability;//FullTime, PartTime
	
	@Column(name="Skills", nullable=false)
	private String skills;
		
	@Column(name= "Hourly_Rate", nullable=false, length=7)
	private double hourlyRate;
	
	@Embedded
	Address address;
	
	@ManyToMany
	@JoinTable(name = "maid_category",joinColumns = @JoinColumn(name = "maid_id"),inverseJoinColumns = @JoinColumn(name = "category_id"))
    //@JoinColumn(name = "category_id")
    private List<Category> category;

	@OneToMany(mappedBy = "maid")
	private List<Booking> bookings;

	
	@OneToMany(mappedBy = "maid")
	private List<Review> ratings;
	

}
