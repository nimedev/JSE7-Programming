package com.example;

import com.example.business.EmployeeStockPlan;
import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Enginer;
import com.example.domain.Manager;

/**
 *
 * @author niconator
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enginer eng = new Enginer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Manager m = new Manager("US Matketing", 207, "Barbara Johnson",
                "054-12-2367", 109_501.36);
        Admin a = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
        Director d = new Director(100_000_000.00, "Global Marketing", 12,
                "Susan Wheeler", "099-45-2340", 120_567.36);
        EmployeeStockPlan esp = new EmployeeStockPlan();
        
        printEmployee(eng, esp);
        printEmployee(m, esp);
        printEmployee(a, esp);
        printEmployee(d, esp);
        
        System.out.println("");
        System.out.println("Cambio:");
        m.setName("Barbara Johnson-Smythe");
        m.raiseSalary(10_000.00);
        printEmployee(m);
        
        System.out.println("");
        System.out.println("Agregando a la lista:");
        m.addEmployee(eng);
        m.addEmployee(a);
        m.addEmployee(d);
        m.printStaffDetails();
        
        System.out.println("");
        System.out.println("Quitando de la lista:");
        m.removeEmployee(d);
        m.printStaffDetails();
    }
    
    public static void printEmployee(Employee e) {
        System.out.println("");
        System.out.println("Type: "+e.getClass().getSimpleName());
        System.out.println(e);
    }
    
    public static void printEmployee(Employee e, EmployeeStockPlan esp) {
        printEmployee(e);
        System.out.println("Stock: " + esp.grantStock(e));
    }
}
