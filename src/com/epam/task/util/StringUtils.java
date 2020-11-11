package com.epam.task.util;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringUtils {
    private static final String ALPHABETIC = "\\p{javaAlphabetic}+";
    private static final String SPACE = " ";

    public static String[] createArrayOfWords(String string) {
        String[] words = {};
        Pattern pattern = Pattern.compile(ALPHABETIC);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            String word = matcher.group();
            int lastIndex = words.length;
            words = Arrays.copyOf(words, (lastIndex + 1));
            words[lastIndex] = word;
        }

        return words;
    }

    public static void printStringsArray(String[] strings) {
        StringBuilder sb = new StringBuilder();

        for (String string : strings) {
            sb.append(string).append(SPACE);
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
