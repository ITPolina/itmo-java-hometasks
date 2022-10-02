package hw5;
import java.util.Arrays;
public class Task5 {
    public static void main(String[] args) {
       int[] ints1 = {-7, 56, 7, -89, -4, 25, 6, 31, -8, 10};
       int k = 0;
       for (int v : ints1) {
           if (v<0) k++;
       }
       int [] ints2  = new int[k];
       byte i = 0;
       for(int v :ints1) {
           if(v < 0) {
               ints2[i] = v;
               i++;
           }
       }
        System.out.println(Arrays.toString(ints2));
    }
}
