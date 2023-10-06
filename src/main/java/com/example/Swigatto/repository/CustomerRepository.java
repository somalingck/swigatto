package com.example.Swigatto.repository;

import com.example.Swigatto.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
public Customer  findByMobileNo(String mobile);

}
