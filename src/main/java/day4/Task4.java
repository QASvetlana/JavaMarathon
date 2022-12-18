package day4;


import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random rand = new Random();

        int maxStringId = 0;
        int maxString = 0;

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = rand.nextInt(10000);

        for (int i = 0; i < numbers.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += numbers[j];
            }

            if (sum >= maxString) {
                maxString = sum;
                maxStringId = i;
            }

        }
        System.out.println(maxString);
        System.out.println(maxStringId);
    }
}

