package com.example.lab_rds_elastic.controller;

import com.example.lab_rds_elastic.entity.Customer;
import com.example.lab_rds_elastic.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAllCustomers();
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        return this.customerService.saveCustomer(customer);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findCustomer(@PathVariable Long id) {
        return ResponseEntity.ok(customerService.findCustomer(id));
    }
}
