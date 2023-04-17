package com.anagraceTech.abstracts;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("miao miao!!");
    }
}
