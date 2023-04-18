package com.anagraceTech.polymorphism;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;
    private Vehicles[] vehicles;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Vehicles[] vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicles[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles[] vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Arrays.equals(vehicles, person.vehicles);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(vehicles);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicles=" + Arrays.toString(vehicles) +
                '}';
    }

}
