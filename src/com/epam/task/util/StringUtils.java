package com.epam.task.util;

public class StringUtils {
    private static final String SPACE = " ";

    public static void printStringsArray(Object[] objects, String regex) {
        StringBuilder sb = new StringBuilder();
        for (Object object : objects) {
            sb.append(object).append(regex);
        }

        System.out.println(sb.toString());
    }

    public static String createStringFromArray(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String string : strings) {
            stringBuilder.append(string).append(SPACE);
        }

        return stringBuilder.toString();
    }
}
