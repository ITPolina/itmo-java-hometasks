package ru.polina.homeworks.hw6.task3;

public class Application {
    public static void main(String[] args) {

        Mouse m1 = new Mouse();
        Mouse m2 = new Mouse();
        Mouse m3 = new Mouse();
        Mouse m4 = new Mouse();
        Mouse m5 = new Mouse();
        Mouse m6 = new Mouse();
        Mouse m7 = new Mouse();
        Mouse m8 = new Mouse();
        Mouse m9 = new Mouse();
        Mouse m10 = new Mouse();

        Cat c1 = new Cat("Vasya");
        Cat c2 = new Cat("Murzik");
        Cat c3 = new Cat("Klepa");
        Cat c4 = new Cat("Sonya");



        //System.out.println(c1);

        c1.catchMouse(m1);
        c1.catchMouse(m2);
        c1.catchMouse(m3);
        c1.catchMouse(m4);
        c1.catchMouse(m5);
        c1.catchMouse(m6);

        c2.catchMouse(m7);
        c2.catchMouse(m8);
        c2.catchMouse(m9);

        c3.catchMouse(m10);
        //System.out.println(c1);







    }
}
