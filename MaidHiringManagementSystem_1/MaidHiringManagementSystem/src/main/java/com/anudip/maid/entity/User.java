package com.anudip.maid.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
//@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name="user_type", discriminatorType=DiscriminatorType.STRING)
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="fname", nullable=false, length=50)
	private String fname;
	
	@Column(name="mname", length=50)
    private String mname;
	
	@Column(name="lname", nullable=true, length=50)
	private String lname;
	
	private String username;
	
	
	@Column(name="email", nullable=false, length=50, unique=true)
	private String email;
	
	@Column(name="PhoneNumber", nullable=false, length=10, unique=true)
	private String phoneNumber;
	
	@Embedded
	//@OneToOne(cascade=CascadeType.ALL)
	Address address;
	
	@Column(name="password", nullable=false, length=25)
	private String password;
	
/*	@Column(name="role", nullable=false, length=50)
	@Enumerated(EnumType.STRING)
	private Role role;//maid, client or admin*/


}
