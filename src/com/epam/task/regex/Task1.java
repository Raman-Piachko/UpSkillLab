package com.epam.task.regex;

import com.epam.task.service.StringService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.epam.task.util.InputUtils.inputIntValue;

public class Task1 {
    private static final String OPERATION_REQUEST = """
            Please select number an operation :
            1-> sort paragraphs by number of sentences;
            2-> sort words by length in sentences;
            3-> sort lexemes by occurrence of symbol;
            4-> exit the application.
            Your choice:\s""";
    private static final String WRONG_INPUT = "Wrong input, try again!";
    private static final String EXIT = "Application closed";
    private static final String PATH = "src/com/epam/task/regex/Text.txt";

    public static void main(String[] args) throws IOException {
        runApp();
    }

    private static void runApp() throws IOException {
        Path path = Path.of(PATH);
        String text = new String(Files.readAllBytes(path));
        StringService stringService = new StringService();
        int choice = inputIntValue(OPERATION_REQUEST);

        switch (choice) {
            case (1) -> stringService.sortParagraphs(text);
            case (2) -> stringService.sortWordsInSentenceByLength(text);
            case (3) -> stringService.sortLexemeInCurrentSentence(text);
            case (4) -> System.out.println(EXIT);
            default -> {
                System.out.println(WRONG_INPUT);
                runApp();
            }
        }
    }
}