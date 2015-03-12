package com.example.dao;

import com.example.model.Employee;

/**
 *
 * @author niconator
 */
public interface EmployeeDAO {

    public void add(Employee emp);

    public void update(Employee emp);

    public void delete(int d);

    public Employee findById(int id);

    public Employee[] getAllEmployees();
}
