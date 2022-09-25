package hw2;

public class Task5 {
    public static void main(String[] args) {
        float age = 26.5f;
        float exp = 5.5f;
        if ((exp <= age - 18) && age >= 18 ) { // предполагаем, что работают с 18 лет
            if (age <= 100) {
                if (exp < 5) {
                    System.out.println("Вы подходите на должность стажера");
                } else {
                    System.out.println("Вы подходите на должность разработчика");
                }
            } else {
                System.out.println("Мы Вам перезвоним");
            }
        } else {
            System.out.println("Ошибка ввода данных");
        }

    }
}

