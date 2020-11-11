package com.epam.task.regex;

import java.util.Comparator;

public class LengthOfWordComparator implements Comparator<String> {
    private String REGEX;

    public LengthOfWordComparator(String REGEX) {
        this.REGEX = REGEX;
    }

    @Override
    public int compare(String firstString, String secondString) {
        return Integer.compare(firstString.length(), secondString.length());
    }
}
