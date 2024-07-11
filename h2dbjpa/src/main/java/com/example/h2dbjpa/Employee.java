package com.example.h2dbjpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private int empId;
    private String empName;
    private float eSal;

    public Employee(int empId, String empName, float eSal) {
        this.empId = empId;
        this.empName = empName;
        this.eSal = eSal;
    }

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float geteSal() {
        return eSal;
    }

    public void seteSal(float eSal) {
        this.eSal = eSal;
    }

}
