package com.epam.task.regex;

import com.epam.task.service.StringService;

import static com.epam.task.util.InputUtils.inputIntValue;

public class Task1 {
    private static final String STRING = "А ведь действительно,  правильно писать база акак? Многие авторы (и я тоже, иногда, в этом повинен) не много внимания уделяют правильности составления абзаца. Не говоря уже, о его размерах и структуре.\n"
            + "В прошлой статье, о структуре излагаемого материала, я вскользь упоминал об абзацах. Но, данной теме, стоит посвятить отдельную статью.";

    private static final String OPERATION_REQUEST = """
            Please select number an operation :
            1-> sort paragraphs by number of sentences;
            2-> sort words by length in sentences;
            3-> sort lexemes by occurrence of symbol;
            4-> exit the application.
            Your choice:\s""";
    private static final String WRONG_INPUT = "Wrong input, try again!";
    private static final String EXIT = "Application closed";

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        StringService stringService = new StringService();
        int choice = inputIntValue(OPERATION_REQUEST);

        switch (choice) {
            case (1) -> stringService.sortParagraphs(STRING);
            case (2) -> stringService.sortWordsInSentenceByLength(STRING);
            case (3) -> stringService.sortLexemeInCurrentSentence(STRING);
            case (4) -> System.out.println(EXIT);

            default -> {
                System.out.println(WRONG_INPUT);
                runApp();
            }
        }
    }
}
