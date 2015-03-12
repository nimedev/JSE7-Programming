package com.example;

public class Cat extends Animal implements Pet {

    private Nameable nameable = new NameableImpl();
    private Ambulatory ambulatory;

    public Cat() {
        this("Fluffy");
    }

    public Cat(String name) {
        ambulatory = new AmbulatoryImpl(4);
        setName(name);
    }

    @Override
    public String getName() {
        return nameable.getName();
    }

    @Override
    public void setName(String name) {
        nameable.setName(name);
    }

    public void walk() {
        ambulatory.walk();
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " likes to play with string.");
    }

}
