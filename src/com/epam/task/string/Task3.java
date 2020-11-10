package com.epam.task.string;

public class Task3 {
    private static final String FIRST_POLINDROME = "KAZAK";
    private static final String SECOND_POLINDROME = "AAVVAA";
    private static final String POLINDROME = "AFAAF";

    public static void main(String[] args) {
        System.out.println(isPalindromeWord(FIRST_POLINDROME));
        System.out.println(isPalindromeWord(SECOND_POLINDROME));
        System.out.println(isPalindromeWord(POLINDROME));
    }

    private static boolean isPalindromeWord(String string) {
        StringBuilder rev = new StringBuilder(string).reverse();
        String strRev = rev.toString();

        return string.equalsIgnoreCase(strRev);
    }
}
