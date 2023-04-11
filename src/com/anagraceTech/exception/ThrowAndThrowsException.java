package com.anagraceTech.exception;

public class ThrowAndThrowsException {
    public static double divide(int a, int b) throws IllegalArgumentException{
        //checking if the argument b is legal or not
        if(b == 0){
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        return a/b;
    }



    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }
}
