package com.company.residents.dogs;

public class Dog {
    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog " + name;
    }

}
