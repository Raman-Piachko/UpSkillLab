package com.epam.task.regex;

import java.util.regex.Pattern;

public class PatternConstants {
    public static final Pattern OPEN_TAG = Pattern.compile("<([^/]+[^/])$");
    public static final Pattern CLOSED_TAG = Pattern.compile("<(/.+?[^/]+)");
    public static final Pattern BODY = Pattern.compile("(.+?)</");
    public static final Pattern EMPTY_TAG = Pattern.compile("<([^/].*?[/])");
}
