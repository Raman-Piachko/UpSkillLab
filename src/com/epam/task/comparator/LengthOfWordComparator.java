package com.epam.task.comparator;

import java.util.Comparator;

public class LengthOfWordComparator implements Comparator<String> {
    private  String regex;

    public LengthOfWordComparator(String regex) {
        this.regex = regex;
    }

    @Override
    public int compare(String firstString, String secondString) {
        return Integer.compare(firstString.length(), secondString.length());
    }
}
