package com.anagraceTech.abstractExample;

import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport{

    private static final Pattern PATTERN = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Emails";
    }
}
