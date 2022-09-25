package hw2;

public class Task4 {
    public static void main(String[] args) {
        short a = 10, b = 500; // значание диапазона случайных чисел [10;500]
        short c = (short) (a + (Math.random()*(b+1-a)));
        //short c = (short) ((Math.random()*491) + 10);
        if (c > 25 && c <200) {
            System.out.println("число " + c + " содержится в интервале (25;200)");
        } else {
            System.out.println("число "+ c +" не содержится в интервале (25;200)");
        }

    }
}
