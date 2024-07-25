package com.example.jpapagination.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpapagination.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
