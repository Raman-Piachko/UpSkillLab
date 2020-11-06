package com.epam.task.string;

public class Task2 {
    private static final String STRING = "afasf fafsaf fa";

    public static void main(String[] args) {
        String afterChanges = STRING.replaceAll("a", "ab");
        System.out.println(afterChanges);
    }
}

