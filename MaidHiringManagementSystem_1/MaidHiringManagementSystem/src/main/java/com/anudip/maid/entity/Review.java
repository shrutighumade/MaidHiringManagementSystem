package com.anudip.maid.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
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
@Table(name="Ratings")
public class Review {
   
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name="maid_id", nullable=false)
    private Maid maid;
    
    @ManyToOne
    @JoinColumn(name="client_id", nullable=false)
    private Client client;
    
    
    
    private Integer rating; // 1-5 scale
    
    @Temporal(TemporalType.DATE)
    private LocalDate date;
      
    private String comments;


}
