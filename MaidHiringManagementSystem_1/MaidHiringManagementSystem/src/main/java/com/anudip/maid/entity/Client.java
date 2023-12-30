package com.anudip.maid.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("CLIENT")
public class Client extends User {
	@Embedded
	//@OneToOne(cascade = CascadeType.ALL)
    Address address;
	
    @OneToMany(mappedBy = "client")
	private List<Booking> booking;

	

}
