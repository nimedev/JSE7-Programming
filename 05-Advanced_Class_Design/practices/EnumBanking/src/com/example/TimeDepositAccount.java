package com.example;

import java.util.Calendar;
import java.util.Date;

public class TimeDepositAccount {
    
    private double balance;
    private final Date maturityDate;
    
    public TimeDepositAccount(double balance, DepositLength duration) {
        this.balance = balance;
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, duration.getDays());
        this.maturityDate = cal.getTime();
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    @Override
    public String toString() {
        return getDescription() + ": current balance is " + balance;
    }

    public boolean withdraw(double amount) {
        Date today = new Date();
        if(today.after(maturityDate)) {
            if(amount <= balance) {
                balance -= amount;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String getDescription() {
        return "Time Deposit Account " + maturityDate;
    }
    
}