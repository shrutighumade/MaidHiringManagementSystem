package com.anudip.maid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.maid.entity.Client;


//ClientRepository.java
public interface ClientRepository extends JpaRepository<Client, Long>  {

}
