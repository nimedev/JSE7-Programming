package com.example.dao;

import com.example.model.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author niconator
 */
public class EmployeeDAOMemoryImpl implements EmployeeDAO {

    // not thread-safe
    private static Employee[] employeeArray = new Employee[10];

    protected EmployeeDAOMemoryImpl() {

    }

    // Save our Employee record

    @Override
    public void add(Employee emp) {
        employeeArray[emp.getId()] = emp;
    }

    // Update Employee record
    @Override
    public void update(Employee emp) {
        employeeArray[emp.getId()] = emp;
    }

    // Delete our employee record
    @Override
    public void delete(int d) {
        employeeArray[d] = null;
    }

    // Find an Employee record using this ID
    @Override
    public Employee findById(int id) {
        return employeeArray[id];
    }

    // Return an array of all of the Employee records
    // We are using a collection List object to store the results
    // This makes it easier to just add to the collection
    @Override
    public Employee[] getAllEmployees() {
        List<Employee> emps = new ArrayList<>();
        // Iterate through the memory array and find Employee objects
        for (Employee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
    }
}
