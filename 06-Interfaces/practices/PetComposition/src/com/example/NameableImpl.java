package com.example;

/**
 *
 * @author niconator
 */
public class NameableImpl implements Nameable {

    private String name;

    public NameableImpl() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if (name.length() <= 20) {
            this.name = name;
        } else {
            System.out.println("Name too long");
        }
    }
}
