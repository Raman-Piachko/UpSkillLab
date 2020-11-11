package com.epam.task.service;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.epam.task.util.ArrayUtil.swapElements;
import static com.epam.task.util.ArrayUtil.swapElementsObjectArray;
import static com.epam.task.util.InputUtils.inputIntValue;
import static com.epam.task.util.InputUtils.inputString;
import static com.epam.task.util.StringUtils.*;

public class StringService {
    private static final String END_SENTENCE = "[^.?!]+";
    private static final String PARAGRAPH = "[^\n]+";
    private static final String SYMBOL_REQUEST = "Enter symbol : ";
    private static final String PARAGRAPH_REQUEST = "Enter number of paragraph from 0 to %d :";
    private static final String SENTENCE_REQUEST = "Enter number of sentence from 0 to %d :";

    public static String[] splitTextIntoSentences(String text) {
        String[] sentences = {};
        Pattern pattern = Pattern.compile(END_SENTENCE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String sentence = matcher.group();
            int indexOfLastElement = sentences.length;
            sentences = Arrays.copyOf(sentences, indexOfLastElement + 1);
            sentences[indexOfLastElement] = sentence;
        }

        return sentences;
    }

    public static String[] splitTextIntoParagraphs(String text) {
        String[] paragraphs = {};
        Pattern pattern = Pattern.compile(PARAGRAPH);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String paragraph = matcher.group();
            int indexOfLastElement = paragraphs.length;
            paragraphs = Arrays.copyOf(paragraphs, indexOfLastElement + 1);
            paragraphs[indexOfLastElement] = paragraph;
        }

        return paragraphs;
    }

    public static void sortParagraphsByNumberOfSentences(String text) {
        String[] paragraphs = splitTextIntoParagraphs(text);
        int[] numberOfSentences = new int[paragraphs.length];

        for (int i = 0; i < paragraphs.length; i++) {
            numberOfSentences[i] = splitTextIntoSentences(paragraphs[i]).length;
        }

        sortParagraphs(paragraphs, numberOfSentences);

        for (String paragraph : paragraphs) {
            System.out.println(paragraph);
        }
    }

    public static void sortWordsInSentenceByLength(String text) {
        String[] sentences = splitTextIntoSentences(text);

        for (String sentence : sentences) {
            String[] words = createArrayOfWords(sentence);
            int[] wordLength = new int[words.length];

            for (int j = 0; j < wordLength.length; j++) {
                wordLength[j] = words[j].length();
            }

            sortArrayOfWordsByCountArray(words, wordLength);
            printStringsArray(words);
        }
    }

    public static String sortLexemeBySymbol(String string) {
        String[] words = createArrayOfWords(string);
        int[] arrayOfSymbolCount = new int[words.length];
        String symbol = inputString(SYMBOL_REQUEST);

        fillArrayOfSymbolCount(words, symbol, arrayOfSymbolCount);
        sortArrayOfWordsByCountArray(words, arrayOfSymbolCount);
        sortWordsByAlphabetic(words, arrayOfSymbolCount);

        return createStringFromArray(words);
    }

    public static void sortLexemeInCurrentSentence(String text) {
        String[] paragraphs = splitTextIntoParagraphs(text);
        int numberOfParagraph = inputIntValue(String.format(PARAGRAPH_REQUEST, (paragraphs.length - 1)));
        String[] sentences = splitTextIntoSentences(paragraphs[numberOfParagraph]);
        int numberOfSentence = inputIntValue(String.format(SENTENCE_REQUEST, (sentences.length - 1)));
        System.out.println(sortLexemeBySymbol(sentences[numberOfSentence]));
    }


    public static void sortArrayOfWordsByCountArray(String[] strings, int[] numbers) {
        for (int i = strings.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    swapElements(numbers, j, (j + 1));
                    swapElementsObjectArray(strings, j, (j + 1));
                }
            }
        }
    }

    public static void fillArrayOfSymbolCount(String[] strings, String symbol, int[] numbers) {
        for (int i = 0; i < strings.length; i++) {
            int countSymbols = 0;
            int position = 0;

            while (position != -1) {
                position = strings[i].indexOf(symbol, position);
                if (position != -1) {
                    position++;
                    countSymbols++;
                }
            }

            numbers[i] = countSymbols;
        }
    }


    private static void sortParagraphs(String[] strings, int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swapElementsObjectArray(strings, j, (j + 1));
                    swapElements(numbers, j, (j + 1));
                }
            }
        }
    }

    public static void sortWordsByAlphabetic(String[] strings, int[] numbers) {
        for (int i = strings.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[j + 1]) {
                    if (strings[j].compareToIgnoreCase(strings[j + 1]) > 0) {
                        swapElementsObjectArray(strings, j, (j + 1));
                    }
                }
            }
        }
    }
}
