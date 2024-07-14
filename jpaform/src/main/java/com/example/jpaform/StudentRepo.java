package com.example.jpaform;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepo extends JpaRepository<Students, Integer> {

    @Query("select c from Students c where " +
            "lower(c.name) like concat('%', lower(?1) , '%') or " +
            "concat(c.id,'') like concat('%', ?1 , '%') or " +
            "concat(c.grade,'') like concat('%', ?1 , '%') or " +
            "lower(c.major) like concat('%', lower(?1) , '%') or " +
            "concat(c.marks,'') like concat('%', ?1 , '%') ")
    List<Students> search(String searchString);
}
