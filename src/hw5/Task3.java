package hw5;
import java.util.Scanner;
import java.util.Arrays;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w;
        int n,f,k;
        while (true) {
            System.out.println("Введите целое число от 2 до 6 включительно:");
            n = in.nextInt();
            in.nextLine();
            if (n >= 2 && n <= 6) break;
        }
        String[] words = new String[n];
        System.out.println("Введите новое слово:");
        words[0] = in.nextLine();
        for(int i = 1; i < n; i++) {
            k = 0;
            f = 0;
            System.out.println("Введите новое слово или exit для выхода: ");
            w = in.nextLine();
            if (w.equals("exit")) break;
            for (k=0; k < i; k++) {
                if (w.compareToIgnoreCase(words[k]) != 0) f++;
            }
            if (f == i) {
                words[i] = w;
            } else i--;
        }
        System.out.println(Arrays.toString(words));

    }
}
