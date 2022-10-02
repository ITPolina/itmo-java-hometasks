package hw5;
import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {
        int a = 2, b=20, k;
        //if (a % 2 !=0 && b % 2 !=0) k = (b-a)/2;
        //else
        k = (b-a)/2 + 1;
        int[] ints1 = new int[k];
        for (int i =0; i<k; i++) {
            ints1[i] = a;
            a +=2;
        }
        for (int i = k-1; i >=0; i--) {
            System.out.print(ints1[i] + " ");
        }

    }

}
