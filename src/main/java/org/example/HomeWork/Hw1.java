package org.example.HomeWork;

import java.math.BigInteger;
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int count = sc.nextInt();
        int summa = 0;
        for (int i = 0; i < count; i++) {
            int number = sc.nextInt();
            if (isSimpleNumber(number)) {
                summa += number;
            }
        }
        sc.close();
        System.out.println(summa);
    }
//
    /**
     * @param number входящее число
     * @return Простое число или нет
     * @apiNote Проверка на простое число
     */
//    public static boolean isSimpleNumber(int number) {
//        BigInteger bigInteger = BigInteger.valueOf(number);
//        if (!bigInteger.isProbablePrime(number)) return false;
//        return true;
//    }
    public static boolean isSimpleNumber(int number){
        if (number == 1) return false;
        else if (number < 0) return false;
        for (int i = 2; i <= number / 2 ; i++) {
            if (number % i == 0 & number > 0) return false;
        }
        return true;
    }
}



