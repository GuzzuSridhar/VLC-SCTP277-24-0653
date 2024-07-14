package com.example.jpqldemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.jpqldemo.model.Customer;

import jakarta.transaction.Transactional;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    /*
     * @Query annotation
     * positional Parameter
     */

    // all the table and column names should be that within the Entity class
    // members/variables
    @Query("select c from Customer c where lower(c.custname)= ?1")
    List<Customer> findByCustname(String custname);

    /*
     * @Query annotation
     * named Parameter
     */

    @Query("select c from Customer c where c.custid = :cid")
    Customer findc(int cid);

    /*
     * Custom queries
     * using the built-in method naming
     * https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
     */
    Customer findByCustnameIgnoreCase(String custname);

    /*
     * Native queries -- written in standard sql
     * all the table and column names should be that within the database table
     */
    @Query(value = "select * from customers where lower(name)= :name", nativeQuery = true)
    Customer findByName(String name);

    /* query to Update data */
    @Modifying
    @Transactional
    @Query("update Customer c set c.custname=:changedValue  where c.custid=:id ")
    void updateName(String changedValue, int id);

    /* query to delete data */
    @Modifying
    @Transactional
    @Query("delete from Customer c where lower(c.custname)=lower(?1)")
    void deleteCustomer(String name);
}
