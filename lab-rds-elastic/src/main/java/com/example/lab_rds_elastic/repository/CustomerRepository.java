package com.example.lab_rds_elastic.repository;

import com.example.lab_rds_elastic.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
