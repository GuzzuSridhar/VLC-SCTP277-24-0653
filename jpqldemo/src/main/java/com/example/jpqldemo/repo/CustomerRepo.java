package com.example.jpqldemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpqldemo.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
