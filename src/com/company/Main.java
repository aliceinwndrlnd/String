package com.company;

public class Main {

    public static void main(String[] args) {

        /* 1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
последнего вхождения сивола(B).*/
        String str = "Just do it!";
        System.out.println(str.substring(4, 7));

     /*2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в
позиции 0 */
        System.out.println(str.replace("t", "J"));

        System.out.println("");

     /*3)В исходном файле находятся слова, каждое слово на новой стороке. После
запуска программы должен создать файл, который будет содержать в себе
только полиндромы.*/

        Palindrom.findPalindrome();







    }
}