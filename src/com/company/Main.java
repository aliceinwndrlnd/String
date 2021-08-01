package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /* 1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
последнего вхождения сивола(B).*/
        String sentence = "Just do it!";
        char first = 's';
        char second = 'i';
        int firstIndex = sentence.indexOf(first);
        int lastIndex = sentence.lastIndexOf(second);
        System.out.println(sentence.substring(firstIndex, lastIndex));


     /*2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в
позиции 0 */
        char firstSymbol = sentence.charAt(3);
        char secondSymbol = sentence.charAt(0);
        System.out.println(sentence.replaceAll(String.valueOf(firstSymbol), String.valueOf(secondSymbol)));

        System.out.println("");

     /*3)В исходном файле находятся слова, каждое слово на новой стороке. После
запуска программы должен создать файл, который будет содержать в себе
только полиндромы.*/

        Palindrom.findPalindrome();

        System.out.println("");

        /*4)Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл.
Пишем все в ООП стиле. Создаём класс TextFormater
в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает с;троку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false
В main считываем файл.
Разбиваем текст на предложения. Используя методы класса TextFormater
определяем подходит ли нам предложение. Если подходит добавляем его в
новый файл*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/com/company/in.txt")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/com/company/out.txt"));

        String source = "";
        String line = bufferedReader.readLine();
        while (line != null) {
            source = source.concat(line);
            line = bufferedReader.readLine();
        }

        String[] countSentences = TextFormater.countSentences(source);
        for (String tmpSentence : countSentences) {
            tmpSentence = tmpSentence.trim();
            int countWordInSentence = TextFormater.countWords(tmpSentence);
            if ((countWordInSentence > 2 && countWordInSentence < 6) ||
                    TextFormater.checkPalindrome(tmpSentence)) {
                bufferedWriter.write(tmpSentence + ".");
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
