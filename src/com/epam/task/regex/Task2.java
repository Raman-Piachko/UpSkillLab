package com.epam.task.regex;

import java.io.IOException;
import java.nio.file.Files;
import java.util.regex.Matcher;

import static com.epam.task.regex.PatternConstants.BODY;
import static com.epam.task.regex.PatternConstants.CLOSED_TAG;
import static com.epam.task.regex.PatternConstants.EMPTY_TAG;
import static com.epam.task.regex.PatternConstants.OPEN_TAG;
import static java.nio.file.Path.of;

public class Task2 {
    private static final String LINE = ">\\s*";
    private static final String RESULT_IS_OPENING_TAG = " - opening tag.\n";
    private static final String RESULT_IS_TAG_CONTENT = " - it is tag content.\n";
    private static final String RESULT_IS_END_TAG = " - end tag.\n";
    private static final String RESULT_IS_EMPTY_TAG = " - empty.\n";
    private static final String XML_PATH = "files/XML.xml";

    public static void main(String[] args) throws IOException {
        String string = new String(Files.readAllBytes(of(XML_PATH)));
        String analysisResult = analyzeStringAsXml(string);
        System.out.println(analysisResult);
    }

    private static String analyzeStringAsXml(String string) {
        String[] strings = string.split(LINE);
        StringBuilder stringBuilder = new StringBuilder();
        for (String line : strings) {
            Matcher openMatcher = OPEN_TAG.matcher(line);
            Matcher closedMatcher = CLOSED_TAG.matcher(line);
            Matcher bodyMatcher = BODY.matcher(line);
            Matcher emptyMatcher = EMPTY_TAG.matcher(line);
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