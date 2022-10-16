package ru.polina.homeworks.hw6.task3;

public class Mouse {
    private int mouseV;

    public Mouse(){
        mouseV = 1 + (int)(Math.random()*10);
    }

    public int getMouseV() {

        return mouseV;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "mouseV=" + mouseV +
                '}';
    }
}
