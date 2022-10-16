package ru.polina.homeworks.hw8;
import ru.polina.homeworks.hw8.School;
import ru.polina.homeworks.hw8.school.Director;

public class Application {
    public static void main(String[] args) {

        Director dir1 = new Director("Пратусевич", 51);

        School school1 = new School("ПФМЛ239", dir1);

        school1.addTeacher();
        school1.addPupil();

        System.out.println(school1);


        school1.schoolDay();
        System.out.println(school1);








    }
}
