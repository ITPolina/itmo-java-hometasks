package ru.polina.homeworks.hw8.school;
import ru.polina.homeworks.hw8.base.Individual;

public final class Director extends Individual{

    public Director(String name, int age){

        super(name, age);
    }
    public void schoolDayBegin() {

        System.out.println("начался учебный день");
    }

    public void schoolDayEnd() {

        System.out.println(" учебный день закончился");
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
