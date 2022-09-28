package hw3;

public class Task1 {
    public static void main(String[] args) {
        for (byte a = 90; a >= 0; a -= 5) {
            if (a % 2 != 0) System.out.print(a + ", ");
        }
        System.out.println(" ");
        for (byte s = 2, t = 1; t <= 10;  t++ ) {
            System.out.print(s + ", ");
            s += 2;
        }
    }
}
