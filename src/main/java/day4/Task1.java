package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Random rand = new Random();
        int[] numbers = new int[n];

        for (int x = 0; x < numbers.length; x++)
            numbers[x] = rand.nextInt(10);
        System.out.print(Arrays.toString(numbers));

        System.out.println("Длинна массива: " + numbers.length);


        int count = 0;
        for (int x = 0; x < numbers.length; x++) {

            if (numbers[x] > 8)
                count++;
        }
        System.out.println("Количество чисел больше 8: " + count);


        int coun = 0;
        for (int x = 0; x < numbers.length; x++) {

            if (numbers[x] == 1)
                coun++;
        }
        System.out.println("Количество чисел равных 1: " + coun);

        int cou = 0;
        for (int x = 0; x < numbers.length; x++) {

            if (numbers[x] % 2 == 0)
                cou++;
        }
        System.out.println("Количество четных чисел: " + cou);

        int co = 0;
        for (int x = 0; x < numbers.length; x++) {

            if (numbers[x] % 2 != 0)
                co++;
        }
        System.out.println("Количество нечетных чисел: " + co);


        int sum = 0;
        for (int x = 0; x < numbers.length; x++)
            sum += numbers[x];
        System.out.println("Сумма всех элементов массива:" + sum);

    }
}



