package com.example;

import com.example.domain.Employee;

/**
 *
 * @author niconator
 */
public class EmployeeText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(101);
        e.setName("Jane Smith");
        e.setSsn("012-34-4567");
        e.setSalary(120_345.27);
        System.out.println("Id: " + e.getEmpId());
        System.out.println("Name: " + e.getName());
        System.out.println("SSN: " + e.getSsn());
        System.out.println("Salary: " + e.getSalary());
    }
    
}
