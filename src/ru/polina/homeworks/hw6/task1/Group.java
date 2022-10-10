package ru.polina.homeworks.hw6.task1;

import java.util.Arrays;
public class Group {
    private Boolean isOpen = true;
    private Alpinist[] alps = new Alpinist[3];
    private Mountain m;

    public void addAlp(Alpinist alp) {
        //добавить условие, что добавление альпиниста, только если набор открыт, иначе return
        if (isOpen) {
            for (int i = 0; i < alps.length; i += 1) {
                if (alps[i] == null) {
                    alps[i] = alp;
                    if (i == alps.length -1 ) {
                        isOpen = false;
                        System.out.println("Альпинисту" +alp.getName() + " не хватило места в этой группе ");
                    }
                    return;
                }

            }

        }

        //System.out.println("Набор в группу закрыт");

    }

    /*public Mountain getM() {
        return m;
    }*/

    public void setM(Mountain m) {
        if (m == null) {
            throw new IllegalArgumentException("Mountain не может быть null");
        }
        this.m = m;
    }

    @Override
    public String toString() {
        return "Group{" +
                "isOpen=" + isOpen +
                ", alps=" + Arrays.toString(alps) +
                ", m=" + m +
                '}';
    }
/*@Override
    public String toString() {
        return "Group{" +
                "nabor=" + nabor +
                ", alp=" + alp +
                ", m=" + m +
                '}';*/
}

