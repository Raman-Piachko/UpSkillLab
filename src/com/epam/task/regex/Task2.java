package com.epam.task.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    private static final String OPENING_TAG = "(<[^/].*?[^/]>)";
    private static final String END_TAG = "</.+?>";
    private static final String TAG_CONTENT = ">(.+?)</";
    private static final String EMPTY = "<\\w.+?/>";
    private static final String RESULT_IS_OPENING_TAG = " - opening tag.\n";
    private static final String RESULT_IS_TAG_CONTENT = " - it is tag content.\n";
    private static final String RESULT_IS_END_TAG = " - end tag.\n";
    private static final String RESULT_IS_EMPTY_TAG = " - empty.\n";

    private static final String XML =
            """
                    <notes>
                       <note id = "1">
                           <to>Вася</to>
                           <from>Света</from>
                           <heading>Напоминание</heading>
                           <body>Позвони мне завтра!</body>
                       </note>
                       <note id = "2">
                           <to>Петя</to>
                           <from>Маша</from>
                           <heading>Важное напоминание</heading>
                           <body/>
                       </note>
                    </notes>""";

    public static void main(String[] args) {
        String analysisResult = analyzeStringAsXML(XML);
        System.out.println(analysisResult);
    }

    private static String analyzeStringAsXML(String string) {
        Pattern openTag = Pattern.compile(OPENING_TAG);
        Pattern closedTag = Pattern.compile(END_TAG);
        Pattern body = Pattern.compile(TAG_CONTENT);
        Pattern emptyTag = Pattern.compile(EMPTY);
        StringBuilder stringBuffer = new StringBuilder();

        String[] strings = string.split("\n\\s*");

        for (String line : strings) {
            Matcher openMatcher = openTag.matcher(line);
            Matcher closedMatcher = closedTag.matcher(line);
            Matcher bodyMatcher = body.matcher(line);
            Matcher emptyMatcher = emptyTag.matcher(line);
            if (openMatcher.find()) {
                stringBuffer.append(openMatcher.group()).append(RESULT_IS_OPENING_TAG);
            }
            if (bodyMatcher.find()) {
                stringBuffer.append(bodyMatcher.group(1)).append(RESULT_IS_TAG_CONTENT);
            }
            if (closedMatcher.find()) {
                stringBuffer.append(closedMatcher.group()).append(RESULT_IS_END_TAG);
            }
            if (emptyMatcher.find()) {
                stringBuffer.append(emptyMatcher.group()).append(RESULT_IS_EMPTY_TAG);
            }
        }
        return stringBuffer.toString();
    }
}