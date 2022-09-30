package hw2;

public class Task1 {
    public static void main(String[] args) {
        int month = 5;
        if (month >= 3 && month <= 5) System.out.println("весна");
            // если после if инструкция одна, то можно писать на той же строке без {}
        else if (month >= 6 && month <= 8) System.out.println("лето");
        else if (month >= 9 && month <= 11) System.out.println("осень");
        else if (month == 12 || month == 1 || month == 2) System.out.println("зима");
        else System.out.println("ошибка месяца");

    // возможно другое задание условия
        // int month = 3; а если -12? оно попадет под первое условие. поэтому надо проверять корректность ввода до if
        // if (month == 12 || month < 3) System.out.println("зима");
        // else if (month < 6) System.out.println("весна");
        // else if (month < 9) System.out.println("лето");
        // else if (month < 12) System.out.println("осень");


    }
}


