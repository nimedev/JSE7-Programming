package com.example;

public class Spider extends Animal {

    private Ambulatory ambulatory;

    public Spider() {
        ambulatory = new AmbulatoryImpl(8);
    }

    public void walk() {
        ambulatory.walk();
    }

    @Override
    public void eat() {
        System.out.println("The spider eats a fly.");
    }

}
