package org.example.HomeWork;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            int number = sc.nextInt();
            array[i] = number;
        }
        sc.close();
        System.out.println(IsAscending(size, array));
    }

    /**
     * @param size  размер массива
     * @param array входящий массив
     * @return да или нет
     * @apiNote Проверка является ли последовательность возрастающей или нет
     */
    private static String IsAscending(int size, int[] array) {
        for (int i = 1; i < size; i++) {
            if (array[i] < array[i - 1]) {
                return "Не по возрастанию";
            }

        }
        return "По возрастанию";
    }
}
