package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
            System.out.println(Arrays.toString(numbers));

        }
        int min = 10000;
        for (int i : numbers) {
            if (i < min)
                min = i;
        }
        System.out.println("Наименьший элемент массива: " + min);

        int max = 0;
        for (int i : numbers) {
            if (i > max)
                max = i;
        }
        System.out.println("Наибольший элемент массива: " + max);

        int count = 0;
        for (int i : numbers) {
            if (i % 10 == 0)
                count++;
        }

        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count);

        int sum = 0;
        for (int i : numbers) {
            if (i % 10 == 0)
            sum += i;
        }

        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}


