package com.anagraceTech.exception;

import java.io.File;
import java.io.IOException;

public class CheckedAndUncheckedException {
    public static void main(String[] args) {
        //Unchecked/Runtime Exception
        try{
            int number = Integer.parseInt("1x");
            System.out.println(number);


            for(int i = 10; i>=0; i--){
                System.out.println(10/i);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //Checked/Compile time Exception
        try{
            File file = new File("src/foo.txt");
            if(!file.exists()){
                file.createNewFile();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
