package hw3;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число от 2 до 100 включительно:");
        byte z = in.nextByte();
        byte a = 2, b = 100;
        byte c = (byte)((b-a)/2);
        byte ans2 = 5;
        if (z >=2 && z <= 100) {
            while (c != z) {
                System.out.println("Загаданное число равно " + c + "? Если да, введите 1, если нет - 0 ");
                byte ans1 = in.nextByte();
                if (ans1 == 1) break;
                else if (ans1 == 0) {
                    while (ans2 != 0 || ans2 != 1) {
                        System.out.println("Загаданное число больше " + c + "? Если да, введите 1, если нет - 0 ");
                        ans2 = in.nextByte();
                        if (ans2 == 1) {
                            a = (byte) (c + 1);
                            c = (byte) ((b - a) / 2 + a);
                        } else if (ans2 == 0) {
                            b = (byte) (c - 1);
                            c = (byte) ((b - a) / 2 + a);
                        } else {
                            System.out.println("Некорректный ввод числа");
                        }
                    }

                } else {
                    System.out.println("Некорректный ввод числа");
                }


            }
            System.out.println("Ура! Мы отгадали ваше число, это: " + c);


        } else {
            System.out.println("Некорректный ввод числа");
        }
    }
}
