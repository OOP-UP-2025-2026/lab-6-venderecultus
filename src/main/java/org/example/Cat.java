package org.example;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Meow";
    }
}