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
        int[] ints1 = new int[n];
        for (int arrIndex = 0; arrIndex<n; arrIndex++) {
            ints1[arrIndex] = (int)(Math.random()*50);
        }
        Arrays.sort(ints1);
        System.out.println("минимальное значение элемента массива равно: " + ints1[0]);
        System.out.println("максимальное значение элемента массива равно: " + ints1[n-1]);
        double sum = 0;
        for (int elementValue: ints1) {
            sum += elementValue;
        }
        System.out.println("среднее арифметическое элементов массива равно: " + sum/n);



    }
}
