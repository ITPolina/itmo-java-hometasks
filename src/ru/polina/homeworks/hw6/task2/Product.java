package ru.polina.homeworks.hw6.task2;

public class Product {
    private String prodName;
    private double protein;
    private double fat;
    private double ch;
    private double kcal;

    public Product (String name){
        prodName = name;
    }

    public Product (String name, double protein){
        prodName = name;
        this.protein = protein;
    }
    public Product (String name, double protein, double fat){
        prodName = name;
        this.protein = protein;
        this.fat = fat;

    }
    public Product (String name, double protein, double fat, double ch){
        prodName = name;
        this.protein = protein;
        this.fat = fat;
        this.ch = ch;
    }

    public String getProdName() {
        return prodName;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        if  (protein> 100 || protein < 0){
            throw new IllegalArgumentException("Количество белков не м.б. больше 100 и меньше нуля");
        }
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        if  (fat > 100 || fat < 0){
            throw new IllegalArgumentException("Количество жиров не м.б. больше 100 и меньше нуля");
        }
        this.fat = fat;
    }

    public double getCh() {
        return ch;
    }

    public void setCh(double ch) {
        if  (ch > 100 || ch < 0){
            throw new IllegalArgumentException("Количество углеводов не м.б. больше 100 и меньше нуля");
        }
        this.ch = ch;
    }

    public double getKcal() {
        return kcal;
    }

    public void setKcal(double kcal) {
        if  (kcal > 906 || kcal <= 0){
            throw new IllegalArgumentException("Количество килокалорий в продукте не м.б. больше 100 и меньше нуля");
        }
        this.kcal = kcal;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodName='" + prodName + '\'' +
                ", protein=" + protein +
                ", fat=" + fat +
                ", ch=" + ch +
                ", kcal=" + kcal +
                '}';
    }
}
