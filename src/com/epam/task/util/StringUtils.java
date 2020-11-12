package com.epam.task.util;

public class StringUtils {

    public static void printStringsArray(Object[] objects, String regex) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object object : objects) {
            stringBuilder.append(object).append(regex);
        }

        System.out.println(stringBuilder.toString());
    }
}