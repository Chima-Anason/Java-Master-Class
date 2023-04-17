package com.anagraceTech.inheritance;

public class Main {

    public static void main(String[] args) {

        String[] languages = {"java", "Go"};

        Programmer programmer = new Programmer(
                "james",
                35,
                "abeokuta",
                "senior developer",
                languages
        );

        System.out.println(programmer);
        System.out.println();
        programmer.writeSomeCode();
    }
}
