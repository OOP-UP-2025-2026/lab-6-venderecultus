package org.example;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        System.out.println(myDog.getName() + " says: " + myDog.makeSound());
        System.out.println(myCat.getName() + " says: " + myCat.makeSound());
    }
}