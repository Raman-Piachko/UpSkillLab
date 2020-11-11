package com.epam.task.comparator;

import com.epam.task.service.StringService;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<Object> {

    private final String REGEX;

    public AlphabeticalComparator(String REGEX) {
        this.REGEX = REGEX;
    }

    @Override
    public int compare(Object firstObject, Object secondObject) {
        StringService stringService = new StringService();
        String firstString = (String) firstObject;
        String secondString = (String) secondObject;
        int len = Math.min(firstString.length(), secondString.length());

        for (int i = 0; i <= len; i++) {
            if (stringService.countNumberOfSymbol(secondString, REGEX) == stringService.countNumberOfSymbol(firstString, REGEX)) {
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