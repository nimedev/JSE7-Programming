package com.example.domain;

/**
 *
 * @author niconator
 */
public class Manager extends Employee {

    private String deptName;
    private Employee[] staff;
    private int employeeCount = 0;

    public Manager(String deptName, int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
        this.staff = new Employee[20];
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Department: " + deptName;
    }

    public int findEmployee(Employee e) {
        for (int n = 0; n < employeeCount; n++) {
            int id = this.staff[n].getEmpId();
            if (id == e.getEmpId()) {
                return id;
            }
        }
        return -1;
    }

    public boolean addEmployee(Employee e) {
        if (findEmployee(e) == -1) {
            this.staff[employeeCount] = e;
            employeeCount++;
        }
        return false;
    }

    public boolean removeEmployee(Employee e) {
        boolean result = false;
        Employee[] temp = new Employee[this.staff.length];
        int i = 0;
        for (int n = 0; n < employeeCount; n++) {
            int id = this.staff[n].getEmpId();
            if (id == e.getEmpId()) {
                result = true;
                continue;
            }
            temp[i] = this.staff[n];
            i++;
        }
        if (result) {
            this.staff = temp;
            this.employeeCount = i;
        }
        return result;
    }

    public void printStaffDetails() {
        System.out.println("Manager: " + getName());
        for (int n = 0; n < employeeCount; n++) {
            System.out.println("******");
            System.out.println("Name: " + this.staff[n]);
        }
    }
}
