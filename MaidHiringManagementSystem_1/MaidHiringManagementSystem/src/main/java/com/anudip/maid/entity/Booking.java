package com.anudip.maid.entity;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Bookings")
public class Booking {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="client_id",nullable=false)
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="maid_id", nullable=false)
	private Maid maid;
	
	@Column(name="Booking_Date",length=30, nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime bookingDateTime;
	
	
  
	@Column(name="Duration_Hours", length=4, nullable=false)
	private Integer durationHours;
    
	@Embedded
	Address address;
   
	@Column(name="Amount",length=6)
	private double amount;
	
	@Enumerated(EnumType.STRING)
	@Column(name="Status", length=10)
    private BookingStatus status;
	
	@Column(name="Note_if_any", length=50)
	private String notes;
	

}
