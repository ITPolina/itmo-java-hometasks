package ru.polina.homeworks.hw8.school;

import ru.polina.homeworks.hw8.base.Education;

public final class Pupil extends Education {
    private int level;
    static String[] pupilsNames = {"Masha","Sasha", "Pasha", "Egor", "Dima", "Veronika", "Varya", "Nadya", "Katya", "Anya"};

    public Pupil(String name, int age, String subject, int level){
        super(name, age, subject);
        if (level < 0){
            throw new IllegalArgumentException("Уровень знаний не может быть меньше нуля");
        }
        this.level = level;
    }

    public static Pupil getPupil(){
        int l = (int)(Math.random()*5);
        int a = (int)(7 + Math.random()*8);
        String n = pupilsNames[(int)(Math.random()*(pupilsNames.length +1))];
        String s = subjects[(int)(Math.random()*(subjects.length +1))];
        Pupil pupil = new Pupil(n, a, s,l);
        return pupil;
    }


    public void study(Teacher teacher){
        //this.level = Math.min(this.level + (int)(Math.random()*(teacher.getSkill() +1)), teacher.getSkill());
        this.level += (int)(Math.random()*(teacher.getSkill() +1));

    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                ", name='" + name + '\'' +
                ", age=" + age +
               ", subject='" + subject + '\'' +
                "level=" + level +

                '}';
    }
}
