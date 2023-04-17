package com.anagraceTech.inheritance;

public class Manager extends Employee{

    private int teamSize;

    public Manager(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }

    public void report(){
        System.out.println(this.name + ": Manager writing team report");
    }
}
