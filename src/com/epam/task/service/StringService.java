package com.epam.task.service;

import com.epam.task.regex.LengthOfWordComparator;
import com.epam.task.regex.NumberOfSymbolWordComparator;
import com.epam.task.regex.ParagraphComparator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.epam.task.util.ArrayUtil.swapElementsObjectArray;
import static com.epam.task.util.InputUtils.inputIntValue;
import static com.epam.task.util.InputUtils.inputString;
import static com.epam.task.util.StringUtils.createStringFromArray;
import static com.epam.task.util.StringUtils.printStringsArray;

public class StringService {
    private static final String END_SENTENCE = "[!?.]";
    private static final String SPACE = " ";
    private static final String PARAGRAPH = "\n";
    private static final String SYMBOL_REQUEST = "Enter symbols regex";
    private static final String PARAGRAPH_REQUEST = "Enter number of paragraph from 0 to %d :";
    private static final String SENTENCE_REQUEST = "Enter number of sentence from 0 to %d :";
    private static final String ALPHABETIC = "\\P{javaAlphabetic}+";

    public static void main(String[] args) {
        String string = "First sentence. Second sentence! Thasfasfird ssentnece?" + "\n" + "asfa. afafas.";
        sortParagraphs(string);
        sortWordsInSentenceByLength(string);
        sortLexemeBySymbol(string);
    }


    public static void sortParagraphs(String text) {
        String[] paragraphs = text.split(PARAGRAPH);
        Object[] sortedParagraphs = Arrays.stream(paragraphs).sorted(new ParagraphComparator(END_SENTENCE)).toArray();
        printStringsArray(sortedParagraphs, PARAGRAPH);
    }

    public static void sortWordsInSentenceByLength(String text) {
        String[] sentences = text.split(END_SENTENCE);
        for (String sentence : sentences) {
            String[] words = sentence.trim().split(ALPHABETIC);
            Object[] sortedSentences = Arrays.stream(words).sorted(new LengthOfWordComparator(ALPHABETIC)).toArray();

            printStringsArray(sortedSentences, SPACE);
        }
    }


    public static void sortLexemeBySymbol(String string) {
        String[] words = string.trim().split(ALPHABETIC);
        Object[] sortedWords = Arrays.stream(words).sorted(new NumberOfSymbolWordComparator()).toArray();
        printStringsArray(sortedWords, SPACE);

    }

    public static void sortLexemeInCurrentSentence(String text) {
        String[] paragraphs = text.split(text);
        int numberOfParagraph = inputIntValue(String.format(PARAGRAPH_REQUEST, (paragraphs.length - 1)));
        String[] sentences = paragraphs[numberOfParagraph].split(END_SENTENCE);
        int numberOfSentence = inputIntValue(String.format(SENTENCE_REQUEST, (sentences.length - 1)));
       // System.out.println(sortLexemeBySymbol(sentences[numberOfSentence]));
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

    public static int numberOfSymbol(String string, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(string);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
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
