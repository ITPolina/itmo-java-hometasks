package hw3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество тарелок ");
        int t = in.nextInt();
        System.out.println("Введите количество моющего средства ");
        double f = in.nextDouble();
        if (f < 0.5 && f > 0) System.out.println("Помыть тарелки не получится, мало средства ");
        if (t <= 0 || f <= 0) System.out.println("Некорректный ввод данных");
        while (t > 0 && f >= 0.5 ) {
            --t;
            f = f - 0.5;
            System.out.println("осталось " + f + " моющего средства");
        }
        if (t >=0 && f >= 0) System.out.println("после помывки осталось " + t + " тарелок и " + f + " моющего средства");




    }
}
