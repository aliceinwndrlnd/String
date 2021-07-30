package com.company;

public class Palindrom {

    public static void findPalindrome() {
        String palindrome = "дед \n довод \n путь \n потоп \n ложка \n орех \n каша \n тут";
        String[] words = palindrome.split(" ");
        for (String word : words) {

            char[] array = word.toCharArray();
            StringBuilder result = new StringBuilder();
            for (int i = array.length - 1; i >= 0; i--) {
                result.append(array[i]);
            }
            if(word.equals(result.toString()))
                System.out.print(word);
        }

    }
}


