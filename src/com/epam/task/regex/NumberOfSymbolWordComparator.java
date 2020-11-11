package com.epam.task.regex;

import java.util.Comparator;

import static com.epam.task.service.StringService.numberOfSymbol;
import static com.epam.task.util.InputUtils.inputString;

public class NumberOfSymbolWordComparator implements Comparator<String> {
    private static final String SYMBOL_REQUEST = "Enter symbols regex : ";
    private String REGEX;

    public NumberOfSymbolWordComparator() {
        this.REGEX = inputString(SYMBOL_REQUEST);
    }

    @Override
    public int compare(String firstString, String secondString) {
        return Integer.compare(numberOfSymbol(firstString, REGEX), numberOfSymbol(secondString, REGEX));
    }

}
