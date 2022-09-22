package hw1;

public class Task4 {
    public static void main(String[] args) {
        byte a = 54;
        byte t = (byte)(a/10);
        byte u=(byte)(a%(t*10));
        int s = t+u;
        System.out.println("сумма цифр двузначного числа равна "+s);


        }
    }
