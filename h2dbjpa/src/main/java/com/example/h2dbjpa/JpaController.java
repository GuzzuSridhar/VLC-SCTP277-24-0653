package com.example.h2dbjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaController {
    @Autowired
    private EmployeeRepo employeeRepo;

    /* selecting all the records */
    @RequestMapping("/list")
    public List<Employee> showAllEmployees() {
        return employeeRepo.findAll();
    }

    /* select a record of a specific Id */
    @RequestMapping("/list/{id}")
    public Employee findOnEmployee(
            @PathVariable("id") int id) {
        return employeeRepo.findById(id).get();
    }

    /* insert a record */
    @RequestMapping("/add")
    public void addEmployee(
            @RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("sal") float sal) {
        Employee newEmployee = new Employee(id, name, sal);
        employeeRepo.save(newEmployee);
    }

    /*
     * Update of a record is the same as the insert with the JPA
     * if the value for the id feild is the one that is existing in the database
     * then the update statement is executed. if the value for the id feild is new
     * then the insert is executed
     */

    @RequestMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        employeeRepo.deleteById(id);
        return "Employee with the id " + id + " is deleted";
    }

    @RequestMapping("/populate")
    public void addDummyData() {
        Employee dummy;
        dummy = new Employee(10, "Alex", 1000f);
        employeeRepo.save(dummy);
        dummy = new Employee(11, "Sara", 2672.67f);
        employeeRepo.save(dummy);
        dummy = new Employee(12, "David", 1262.7f);
        employeeRepo.save(dummy);
    }
}
