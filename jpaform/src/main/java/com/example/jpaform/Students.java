package com.example.jpaform;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Students {
    @Id
    private int id;
    private String name;
    private int grade;
    private String major;
    private float marks;

}
