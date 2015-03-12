package com.example;

/**
 *
 * @author niconator
 */
public class AmbulatoryImpl implements Ambulatory {

    private int legs;

    public AmbulatoryImpl(int legs) {
        this.legs = legs;
    }

    @Override
    public void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }
}
