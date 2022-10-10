package hw5;
import java.util.Scanner;
import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Введите целое число от 2 до 30 включительно:");
            n = in.nextInt();
            if (n>=2 && n<=30 ) break;
        }
        double sum = 0;
        int min = 50, max = 0;
        int[] ints1 = new int[n];
        for (int i = 0; i<n; i++) {
            ints1[i] = (int)(Math.random()*50);
        // переделанный вариант
            sum += ints1[i];
            if (ints1[i] < min) min = ints1[i];
            if (ints1[i] > max) max = ints1[i];
        }
        System.out.println("минимальное значение элемента массива равно: " + min);
        System.out.println("максимальное значение элемента массива равно: " + max);
        System.out.println("среднее арифметическое элементов массива равно: " + sum/n);

        //Arrays.sort(ints1);
        //System.out.println("минимальное значение элемента массива равно: " + ints1[0]);
        //System.out.println("максимальное значение элемента массива равно: " + ints1[n-1]);

        //for (int elementValue: ints1) {
        //    sum += elementValue;
        //}
        //System.out.println("среднее арифметическое элементов массива равно: " + sum/n);



    }
}
