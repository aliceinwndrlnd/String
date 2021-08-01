package com.company;

public class TextFormater {

    public static int countWords(String str) {
        return str.split(" ").length;
    }

    public static String[] countSentences(String str) {
        return str.split("[\\.\\!\\?]");
    }
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindrome(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String tmp = words[i];
            tmp.replaceAll("[\\.\\!\\?]", "");
            if (isPalindrome(tmp)) {
                return true;
            }
        }
        return false;
    }
}