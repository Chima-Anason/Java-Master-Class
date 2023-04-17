package com.anagraceTech.abstractExample;

import com.anagraceTech.inheritance.Programmer;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        String path = "src/data.txt";


        ExtractorReport numberExtractorReport = new NumberExtractorReport();
        ExtractorReport emailExtractorReport = new EmailExtractorReport();
        ExtractorReport[] reports = {numberExtractorReport, emailExtractorReport};
        try {
            for (ExtractorReport report : reports) {
                report.prepareAndSendReport(path);
                System.out.println("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
