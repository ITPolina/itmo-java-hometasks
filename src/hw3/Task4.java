package hw3;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        byte c = (byte) (1 + (Math.random()*9));

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 9 включительно или 0 для выхода из программы");
        byte f = in.nextByte();
        // if (f >=1 && f <=9) {
            while (f != c) {
                if (f >=1 && f <=9) {
                    if (c > f) System.out.println("Загаданное число больше");
                    else {
                        System.out.println("Загаданное число меньше");
                        System.out.println("Введите другое целое число от 1 до 9 включительно или 0 для выхода");
                        f = in.nextByte();
                    }
                } else if (f == 0) {
                    System.out.println("Выход из программы");
                    break;
                } else {
                    System.out.println(" Некорректный ввод");
                    System.out.println("Введите другое целое число от 1 до 9 включительно или 0 для выхода");
                    f = in.nextByte();
                }
            } if (f >= 1 && f <= 9) System.out.println("Вы угадали");



    }
}
