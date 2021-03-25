package com.cognizant.customer.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

}
