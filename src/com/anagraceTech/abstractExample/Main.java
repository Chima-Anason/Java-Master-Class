package com.anagraceTech.abstractExample;

import com.anagraceTech.inheritance.Programmer;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        String path = "src/data.txt";

        ExtractorReport numberExtractorReport = new NumberExtractorReport();
        ExtractorReport emailExtractorReport = new EmailExtractorReport();
        try {
            numberExtractorReport.prepareAndSendReport(path);
            System.out.println("\n");
            emailExtractorReport.prepareAndSendReport(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
