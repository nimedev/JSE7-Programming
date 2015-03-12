package com.example;

/**
 *
 * @author niconator
 */
public class CheckingAccount extends Account {

    private final double overDraftLimit;

    public CheckingAccount(double overDraftLimit, double balance) {
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }

    public CheckingAccount(double balance) {
        this(balance, 0);
    }

    @Override
    public String getDescription() {
        return "Checking Account";
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= overDraftLimit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

}
