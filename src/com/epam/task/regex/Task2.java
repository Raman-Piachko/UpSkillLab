package com.epam.task.regex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    private static final String LINE = ">\\s*";
    private static final String OPENING_TAG = "<([^/]+[^/])$";
    private static final String END_TAG = "<(/.+?[^/]+)";
    private static final String TAG_CONTENT = "(.+?)</";
    private static final String EMPTY = "<([^/].*?[/])";
    private static final String RESULT_IS_OPENING_TAG = " - opening tag.\n";
    private static final String RESULT_IS_TAG_CONTENT = " - it is tag content.\n";
    private static final String RESULT_IS_END_TAG = " - end tag.\n";
    private static final String RESULT_IS_EMPTY_TAG = " - empty.\n";
    private static final String PATH = "src/com/epam/task/regex/XML.xml";

    public static void main(String[] args) throws IOException {
        String string = new String(Files.readAllBytes(Path.of(PATH)));
        String analysisResult = analyzeStringAsXml(string);
        System.out.println(analysisResult);
    }

    private static String analyzeStringAsXml(String string) {
        Pattern openTag = Pattern.compile(OPENING_TAG);
        Pattern closedTag = Pattern.compile(END_TAG);
        Pattern body = Pattern.compile(TAG_CONTENT);
        Pattern emptyTag = Pattern.compile(EMPTY);
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = string.split(LINE);

        for (String line : strings) {
            Matcher openMatcher = openTag.matcher(line);
            Matcher closedMatcher = closedTag.matcher(line);
            Matcher bodyMatcher = body.matcher(line);
            Matcher emptyMatcher = emptyTag.matcher(line);
            if (openMatcher.find()) {
                stringBuilder.append(openMatcher.group(1)).append(RESULT_IS_OPENING_TAG);
            }
            if (bodyMatcher.find()) {
                stringBuilder.append(bodyMatcher.group(1)).append(RESULT_IS_TAG_CONTENT);
            }
            if (closedMatcher.find()) {
                stringBuilder.append(closedMatcher.group(1)).append(RESULT_IS_END_TAG);
            }
            if (emptyMatcher.find()) {
                stringBuilder.append(emptyMatcher.group(1)).append(RESULT_IS_EMPTY_TAG);
            }
        }

        return stringBuilder.toString();
    }
}