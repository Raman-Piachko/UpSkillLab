package com.epam.task.regex;

import static com.epam.task.service.StringService.*;
import static com.epam.task.util.InputUtils.inputString;

public class Task1 {
    private static final String STRING = "А ведь действительно,  правильно писать база акак? Многие авторы (и я тоже, иногда, в этом повинен) не много внимания уделяют правильности составления абзаца. Не говоря уже, о его размерах и структуре.\n"
            + "В прошлой статье, о структуре излагаемого материала, я вскользь упоминал об абзацах. Но, данной теме, стоит посвятить отдельную статью.";

    private static final String OPERATION_REQUEST = "Please enter operation name: sortParagraph, sortWords, sortLexeme :";
    private static final String SORT_PARAGRAPH = "sortParagraph";
    private static final String SORT_WORDS = "sortWords";
    private static final String SORT_LEXEME = "sortLexeme";
    private static final String WRONG_INPUT = "Wrong input, try again!";

    public static void main(String[] args) {
        runApp(STRING);
    }

    private static void runApp(String string) {
        String choice = inputString(OPERATION_REQUEST);
        switch (choice) {
            case (SORT_PARAGRAPH) -> sortParagraphsByNumberOfSentences(string);
            case (SORT_WORDS) -> sortWordsInSentenceByLength(string);
            case (SORT_LEXEME) -> sortLexemeInCurrentSentence(string);
            default -> {
                System.out.println(WRONG_INPUT);
                runApp(STRING);
            }

        }
    }
}
