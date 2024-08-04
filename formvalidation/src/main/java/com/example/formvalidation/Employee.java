package com.example.formvalidation;

import java.time.LocalDate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class Employee {
    @NotNull(message = "ID is Mandatory")
    private long id;
    @Size(min = 3, max = 20, message = "The name has to between 2 and 20 characters")
    @NotNull
    private String name;
    @Past(message = "only past dates")
    private LocalDate doj;
    @Min(18)
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
