package ru.polina.homeworks.hw8.base;

abstract public class Individual {
    protected String name;
    protected int age;

    public Individual (String name, int age) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("Имя не может содержать менее трех букв");
        }
        if (age < 7) {
            throw new IllegalArgumentException("Возраст не может быть меньше 7 лет");
        }

        this.name = name;
        this.age = age;
    }



}
