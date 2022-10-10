package ru.polina.homeworks.hw6.task2;

import java.util.Arrays;

public class MyProducts {

    private double maxPr;
    private double maxFat;
    private double maxCh;
    private double maxKcal;
    private Product[] myProds = new Product[3];

    public double getMaxPr() {
        return maxPr;
    }

    public void setMaxPr(double maxPr) {
        if  (maxPr > 100 || maxPr <= 0){
            throw new IllegalArgumentException("Максимальное количество белков не м.б. больше 100 и меньше нуля");
        }
        this.maxPr = maxPr;
    }

    public double getMaxFat() {
        return maxFat;
    }

    public void setMaxFat(double maxFat) {
        if  (maxFat > 100 || maxFat <= 0){
            throw new IllegalArgumentException("Максимальное количество жиров не м.б. больше 100 и меньше нуля");
        }
        this.maxFat = maxFat;
    }

    public double getMaxCh() {
        return maxCh;
    }

    public void setMaxCh(double maxCh) {
        if  (maxCh > 100 || maxCh <= 0){
            throw new IllegalArgumentException("Максимальное количество углеводов не м.б. больше 100 или меньше нуля");
        }
        this.maxCh = maxCh;
    }

    public double getMaxKcal() {
        return maxKcal;
    }

    public void setMaxKcal(double maxKcal) {
        if  (maxKcal > 906 || maxKcal <= 0){
            throw new IllegalArgumentException("Максимальное количество килокалорий не м.б. больше 906 или меньше нуля");
        }
        this.maxKcal = maxKcal;
    }

    public void addProduct(Product prod){
        for (int i = 0; i < myProds.length; i += 1) {
            if (prod.getProtein() > maxPr) {
                System.out.println(prod.getProdName() + " нельзя вкючить в список ваших продуктов из-за высокого содержания белков");
                return;
            }
            if (prod.getFat() > maxFat) {
                System.out.println(prod.getProdName() + " нельзя вкючить в список ваших продуктов из-за высокого содержания жиров");
                return;
            }
            if (prod.getCh() > maxCh) {
                System.out.println(prod.getProdName() + " нельзя вкючить в список ваших продуктов из-за высокого содержания углеводов");
                return;
            }
            if (prod.getKcal() > maxKcal) {
                System.out.println(prod.getProdName() + " нельзя вкючить в список ваших продуктов из-за высокой калорийности");
                return;
            }

            if (myProds[i] == null) {
                myProds[i] = prod;

            return;
            }
            if (i == myProds.length - 1) {

                System.out.println("Список ваших продуктов заполнен, "+ prod.getProdName() + " невозможно внести в список");
            }

        }
    }

    public void printList() {
        System.out.println("Список ваших продуктов: ");
        for (int i = 0; i < myProds.length; i += 1) {
            System.out.println(myProds[i].getProdName());
        }
    }


    @Override
    public String toString() {
        return "MyProducts{" +
                "maxPr=" + maxPr +
                ", maxFat=" + maxFat +
                ", maxCh=" + maxCh +
                ", maxKcal=" + maxKcal +
                ", myProds=" + Arrays.toString(myProds) +
                '}';
    }

}
