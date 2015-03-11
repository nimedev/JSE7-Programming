package com.example.domain;

import java.text.NumberFormat;

/**
 *
 * @author niconator
 */
public class Director extends Manager {

    private double budget;

    public Director(double budget, String deptName, int empId, String name, String ssn, double salary) {
        super(deptName, empId, name, ssn, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Budget: " + NumberFormat.getPercentInstance().format(budget);
    }
}
