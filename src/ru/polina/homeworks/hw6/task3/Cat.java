package ru.polina.homeworks.hw6.task3;


import java.util.Arrays;

public class Cat {
    private final String name;
    private int catV;
    private int catW;
    private Mouse[] catMice = new Mouse[10];

    public Cat(String name){ //}, int miceCount) {
        if (name == null) {
            throw new IllegalArgumentException("имя кота не может быть пустым");
        }
        this.name = name;
        catV = (int)(1 + Math.random()*15);
        catW = (int)(3+Math.random()*7);
        //if (miceCount < 3) {
          //  throw new IllegalArgumentException("у кота не может быть память меньше , чем на 3 мыши");
        //}
        //catMice = new Mouse[miceCount];
    }

    public void catchMouse(Mouse mouse){
        if (catV > mouse.getMouseV()){
            for (int i = 0; i < catMice.length; i++){
                if (catMice[i] == null) {
                    catMice[i] = mouse;
                    return;
                }
            }
        }

    }

    public void attackCat(Cat cat) {
        if (this.catW > cat.catW) {
            for (int i = 0; i < catMice.length; i++){
                if (catMice[i] == null) {
                    for (int b =0; b < cat.catMice.length; b++){
                        if (cat.catMice[b] != null && this.catV > cat.???  ) {
                            this.catMice[i] = cat.catMice[b];
                            cat.catMice[b] = null;
                            break;
                        }
                        cat.catMice[b] = null;

                    }

                }
            }

        }
    }

    public int getCatV() {
        return catV;
    }

    public int getCatW() {
        return catW;
    }

    public Mouse[] getCatMice() {
        return catMice;
    }




    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", catV=" + catV +
                ", catW=" + catW +
                ", catMice=" + Arrays.toString(catMice) +
                '}';
    }
}



