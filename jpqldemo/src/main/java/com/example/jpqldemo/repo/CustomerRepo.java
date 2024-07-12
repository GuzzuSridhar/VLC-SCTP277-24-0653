package com.example.jpqldemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jpqldemo.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    /*
     * @Query annotation
     * positional Parameter
     */

    @Query("select c from Customer c where lower(c.custname)= ?1")
    List<Customer> findByCustname(String custname);

    /*
     * @Query annotation
     * named Parameter
     */

    @Query("select c from Customer c where c.custid = :cid")
    Customer findc(int cid);

}
