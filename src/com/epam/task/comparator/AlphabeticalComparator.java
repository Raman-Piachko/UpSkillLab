package com.epam.task.comparator;

import com.epam.task.service.StringService;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<String> {

    private String regex;
    private StringService stringService = new StringService();

    public AlphabeticalComparator(String regex) {
        this.regex = regex;
    }

    @Override
    public int compare(String firstString, String secondString) {
        int len = Math.min(firstString.length(), secondString.length());

        for (int i = 0; i <= len; i++) {
            if (stringService.countNumberOfSymbol(secondString, regex) == stringService.countNumberOfSymbol(firstString, regex)) {
                if (firstString.charAt(i) > secondString.charAt(i)) {
                    return 1;
                } else if (firstString.charAt(i) < secondString.charAt(i)) {
                    return -1;
                }
            }
        }

        return 0;
    }
}