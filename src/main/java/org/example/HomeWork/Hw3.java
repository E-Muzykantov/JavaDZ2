package org.example.HomeWork;

import java.util.Arrays;

public class Hw3 {
    public static void main(String[] args) {
        //Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
        int[] array = new int[]{1, 22, 33, 44, 5, -15, -3, 23, -7};
        int sumIndexDoubleNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 || array[i] <= -10) {
                sumIndexDoubleNumber += i;
            }
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = sumIndexDoubleNumber;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
