package com.epam.task.regex;

import java.util.Comparator;

public class ParagraphComparator implements Comparator<String> {

    private String REGEX;

    public ParagraphComparator(String REGEX) {
        this.REGEX = REGEX;
    }

    @Override
    public int compare(String firstString, String secondString) {
        String[] firstParagraph = firstString.split(REGEX);
        String[] secondParagraph = secondString.split(REGEX);
        return Integer.compare(firstParagraph.length, secondParagraph.length);
    }
}
