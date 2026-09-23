package com.zoungrana.charly.tp1implementationmicroservice.repositories;

import com.zoungrana.charly.tp1implementationmicroservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;



public interface CustomerRepository extends JpaRepository<Customer, UUID> {

}

