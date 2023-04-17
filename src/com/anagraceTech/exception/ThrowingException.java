package com.anagraceTech.exception;

public class ThrowingException {

    static void samMethod() throws Exception {
        johnMethod();
    }

    static void johnMethod() throws Exception {
        divide(10,2);
    }


    public static double divide(int a, int b) throws Exception{
        if(b == 0){
            throw new Exception("Cannot divide by 0");
        }
        return a/b;
    }
}
