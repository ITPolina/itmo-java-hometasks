package ru.polina.homeworks.hw8.school;

import ru.polina.homeworks.hw8.base.Education;
import ru.polina.homeworks.hw8.school.Pupil;

public class Teacher extends Education {
    private int skill;
    private static int f = 0;

    static String[] teachersNames = {"Мария Ивановна", "Марина Юрьевна", "Кирилл Антонович", "Максим Яковлевич", "Марина Александровна", "Евгений Яковлевич"};
    public Teacher(String name, int age, String subject, int skill){
        super(name, age, subject);
        if (skill < 25){
            throw new IllegalArgumentException("Навык учителя не может быть меньше 25");
        }
        this.skill = skill;
    }
    public static Teacher getTeacher(){
        int l = (int)(25 + Math.random()*16);
        int a = (int)(25 + Math.random()*25);
        String n = teachersNames[f]; //(int)(Math.random()*(teachersNames.length))];
        String s = subjects[(int)(Math.random()*(subjects.length))];
        Teacher teacher = new Teacher(n, a, s,l);
        f++;
        return teacher;
    }



    public void teach(Pupil pupil){
        pupil.study();
    }

    public int getSkill() {
        return skill;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "skill=" + skill +
                ", subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
