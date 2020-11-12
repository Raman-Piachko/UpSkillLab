package com.epam.task.comparator;

import java.util.Comparator;

public class ParagraphComparator implements Comparator<String> {

    private String regex;

    public ParagraphComparator(String regex) {
        this.regex = regex;
    }

    @Override
    public int compare(String firstString, String secondString) {
        String[] firstParagraph = firstString.split(regex);
        String[] secondParagraph = secondString.split(regex);
        return Integer.compare(firstParagraph.length, secondParagraph.length);
    }
}
