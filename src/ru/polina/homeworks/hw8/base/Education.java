package ru.polina.homeworks.hw8.base;
import ru.polina.homeworks.hw8.base.Individual;
abstract public class Education extends Individual{
    protected String subject;

    public Education(String name, int age, String subject){
        super(name, age);
        if (subject == null || subject.length() < 2){
            throw new IllegalArgumentException("Название предмета не может быть короче двух символов");
        }
        this.subject = subject;
    }
    static protected String[] subjects = {"PT", "Math", "Physics", "Geography", "Chemistry", "Biology", "IT", "Music", "History"};
    public String getSubject() {
        return subject;
    }
}
