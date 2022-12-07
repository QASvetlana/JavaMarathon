package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100];
        int vs[] = new int[numbers.length];
        int j=-1;
        int ost;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
             // System.out.print(numbers[i] + " ");

        }
            int min = numbers[0];
            for (int i : numbers)
                if (min > i) {
                    min = i;
                }
             // System.out.println();
            //  System.out.println(min);

        for (int i=0; i<numbers.length; i++) {
            ost = numbers[i]%10;
            if (ost==0){
                j++;
                vs[j]=numbers[i];


       // ost=0;


      //  for (int i=0; i<vs.length; i++)
         //   if (vs[i]>ost) ost=vs[i];


        System.out.println(i+" ");
    }
        }}}


