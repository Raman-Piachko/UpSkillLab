package com.epam.task.comparator;

import com.epam.task.service.StringService;

import java.util.Comparator;

public class NumberOfSymbolWordComparator implements Comparator<String> {

    private String symbol;
    private StringService stringService = new StringService();

    public NumberOfSymbolWordComparator(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public int compare(String firstString, String secondString) {
        return Integer.compare(stringService.countNumberOfSymbol(secondString, symbol), stringService.countNumberOfSymbol(firstString, symbol));
    }

}
