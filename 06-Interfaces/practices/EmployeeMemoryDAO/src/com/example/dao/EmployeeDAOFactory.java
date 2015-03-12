package com.example.dao;

/**
 *
 * @author niconator
 */
public class EmployeeDAOFactory {

    public EmployeeDAO createEmployeeDAO() {
        return new EmployeeDAOMemoryImpl();
    }
}
