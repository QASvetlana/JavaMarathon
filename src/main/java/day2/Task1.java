package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int quantity = s.nextInt();
        if (quantity <= 4 && quantity > 0) {
            System.out.println("Малоэтажный дом");
        } else if (quantity > 4 && quantity < 9) {
            System.out.println("Среднеэтажный дом");
        } else if (quantity >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
