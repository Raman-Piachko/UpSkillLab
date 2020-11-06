package com.epam.task.string;

public class Task1 {
    private static final char SPACE = ' ';
    private static final String STRING = "asfas a   fasf         afasfasf     ";

    public static void main(String[] args) {
        int maxSequenceOfSpacesInString = countMaxSequenceOfSpaces(STRING);
        System.out.println(maxSequenceOfSpacesInString);
    }

    private static int countMaxSequenceOfSpaces(String string) {
        int maxSequence = 0;
        int sequence = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == SPACE) {
                sequence++;
                if (sequence > maxSequence) {
                    maxSequence = sequence;
                }
            } else {
                sequence = 0;
            }
        }

        return maxSequence;
    }
}