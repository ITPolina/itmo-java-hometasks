package hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число ");
        //int a = in.nextInt();
        double a = in.nextDouble();
        if (a>0 && a % 1 ==0) {
            int p = (int)a;
            int sum = p % 10;
            while (p/10 > 0) {
                p /= 10;
                sum = sum + p % 10;

            } System.out.println("сумма цифр числа равна: " + sum);


        } else System.out.println("число введено некорректно ");





    }
}
