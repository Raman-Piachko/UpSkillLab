package com.epam.task.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    private static final String OPEN_TAG = "(<[^/].*?[^/]>)";
    private static final String CLOSED_TAG = "<\\/.+?>";
    private static final String BODY = ">(.+?)</";
    private static final String EMPTY = "<\\w.+?/>";

    private static final String XML =
            "<notes>\n" +
                    "   <note id = \"1\">\n" +
                    "       <to>Вася</to>\n" +
                    "       <from>Света</from>\n" +
                    "       <heading>Напоминание</heading>\n" +
                    "       <body>Позвони мне завтра!</body>\n" +
                    "   </note>\n" +
                    "   <note id = \"2\">\n" +
                    "       <to>Петя</to>\n" +
                    "       <from>Маша</from>\n" +
                    "       <heading>Важное напоминание</heading>\n" +
                    "       <body/>\n" +
                    "   </note>\n" +
                    "</notes>";

    public static String analyzeStringAsXML(String string) {
        Pattern openTag = Pattern.compile(OPEN_TAG);
        Pattern closedTag = Pattern.compile(CLOSED_TAG);
        Pattern body = Pattern.compile(BODY);
        Pattern emptyTag = Pattern.compile(EMPTY);
        StringBuffer stringBuffer = new StringBuffer();

        String[] strings = string.split("\n\\s*");

        for (String line : strings) {
            Matcher openMatcher = openTag.matcher(line);
            Matcher closedMatcher = closedTag.matcher(line);
            Matcher bodyMatcher = body.matcher(line);
            Matcher emptyMatcher = emptyTag.matcher(line);
            if (openMatcher.find()) {
                stringBuffer.append(openMatcher.group()).append(" - open Tag.\n");
            } else if (closedMatcher.find()) {
                stringBuffer.append(closedMatcher.group()).append(" - closed Tag.\n");
            } else if (bodyMatcher.find()) {
                stringBuffer.append(bodyMatcher.group(1)).append(" - it is body.\n");
            } else if (emptyMatcher.find()) {
                stringBuffer.append(emptyMatcher.group()).append(" - empty.\n");
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String analyseResult = analyzeStringAsXML(XML);
        System.out.println(analyseResult);
    }
}
