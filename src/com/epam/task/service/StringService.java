package com.epam.task.service;

import com.epam.task.comparator.AlphabeticalComparator;
import com.epam.task.comparator.LengthOfWordComparator;
import com.epam.task.comparator.NumberOfSymbolWordComparator;
import com.epam.task.comparator.ParagraphComparator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.epam.task.util.InputUtils.inputIntValue;
import static com.epam.task.util.InputUtils.inputString;
import static com.epam.task.util.StringUtils.printStringsArray;

public class StringService {
    private static final String SYMBOL_REQUEST = "Enter symbols regex : ";
    private static final String END_SENTENCE = "[!?.]";
    private static final String SPACE = " ";
    private static final String PARAGRAPH = "\n";
    private static final String PARAGRAPH_REQUEST = "Enter number of paragraph from 0 to %d :";
    private static final String SENTENCE_REQUEST = "Enter number of sentence from 0 to %d :";
    private static final String ALPHABETIC = "\\P{javaAlphabetic}+";


    public void sortParagraphs(String text) {
        String[] paragraphs = text.split(PARAGRAPH);
        Object[] sortedParagraphs = Arrays.stream(paragraphs).sorted(new ParagraphComparator(END_SENTENCE)).toArray();

        printStringsArray(sortedParagraphs, PARAGRAPH);
    }

    public void sortWordsInSentenceByLength(String text) {
        String[] sentences = text.split(END_SENTENCE);

        for (String sentence : sentences) {
            String[] words = sentence.trim().split(ALPHABETIC);
            Object[] sortedSentences = Arrays.stream(words).sorted(new LengthOfWordComparator(ALPHABETIC)).toArray();

            printStringsArray(sortedSentences, SPACE);
        }
    }


    private Object[] sortLexemeBySymbol(String string, String symbol) {
        String[] words = string.trim().split(ALPHABETIC);
        System.out.println(Arrays.toString(words));

        return Arrays.stream(words).sorted(new NumberOfSymbolWordComparator(symbol)).sorted(new AlphabeticalComparator(symbol)).toArray();
    }

    public void sortLexemeInCurrentSentence(String text) {
        String[] paragraphs = text.split(PARAGRAPH);
        int numberOfParagraph = inputIntValue(String.format(PARAGRAPH_REQUEST, (paragraphs.length - 1)));
        String[] sentences = paragraphs[numberOfParagraph].split(END_SENTENCE);
        int numberOfSentence = inputIntValue(String.format(SENTENCE_REQUEST, (sentences.length - 1)));
        String symbol = inputString(SYMBOL_REQUEST);
        Object[] sortedWords = sortLexemeBySymbol(sentences[numberOfSentence], symbol);

        printStringsArray(sortedWords, SPACE);
    }


    public int countNumberOfSymbol(String string, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(string);
        int count = 0;
        while (m.find()) {
            count++;
        }

        return count;
    }
}