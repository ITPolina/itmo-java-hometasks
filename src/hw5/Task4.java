package hw5;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        String sample = "в предложении все слова разных длин";
        String[] str = sample.split(" ");
        //System.out.println(Arrays.toString(str));
        int index = 0;
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() > str[index].length()) {
                index = i;
            }
        }
        System.out.println(str[index]);
    }
}
