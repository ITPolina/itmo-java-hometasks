package hw2;

public class Task3 {
    public static void main(String[] args) {
        byte count = 83;
        if (count <= 100 && count >= 90) System.out.println("отлично"); //если инструкция одна , то можно писать на одной строчке
        else if (count <= 89 && count >= 60) System.out.println("хорошо");
        else if (count <= 59 && count >= 40) System.out.println("удовлетворительно");
        else if (count <= 39 && count >= 0) System.out.println("попробуйте в следующий раз");
        else System.out.println("ошибка ввода");

    }
}

