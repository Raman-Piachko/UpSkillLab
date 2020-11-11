package com.epam.task.comparator;

import com.epam.task.service.StringService;

import java.util.Comparator;

public class NumberOfSymbolWordComparator implements Comparator<String> {

    private static String symbol;


    public NumberOfSymbolWordComparator(String symbol) {
        NumberOfSymbolWordComparator.symbol = symbol;
    }

    @Override
    public int compare(String firstString, String secondString) {
        StringService stringService = new StringService();
        return Integer.compare(stringService.countNumberOfSymbol(secondString, symbol), stringService.countNumberOfSymbol(firstString, symbol));
    }

}
