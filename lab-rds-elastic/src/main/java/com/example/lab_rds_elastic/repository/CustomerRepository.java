package com.example.lab_rds_elastic.repository;

import com.lab.rds.lab_rds.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
