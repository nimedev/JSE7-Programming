package com.example.domain;

import java.text.NumberFormat;

/**
 *
 * @author niconator
 */
public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increase) {
        if (salary > 0) {
            this.salary = this.salary + increase;
        }
    }

    @Override
    public String toString() {
        return "Id: " + empId + "\n"
                + "Name: " + name + "\n"
                + "SSN: " + ssn + "\n"
                + "Salary: " + NumberFormat.getCurrencyInstance().format(salary);
    }
}
