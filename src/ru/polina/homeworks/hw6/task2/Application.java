package ru.polina.homeworks.hw6.task2;

public class Application {
    public static void main(String[] args) {

        Product prod1 = new Product("beef");
        prod1.setProtein(18.9);
        prod1.setFat(12.4);
        prod1.setCh(0.0);
        prod1.setKcal(187);


        Product prod2 = new Product("bread",4.7);
        prod2.setFat(0.7);
        prod2.setCh(49.8);
        prod2.setKcal(224);

        Product prod3 = new Product("milk", 3.2, 3.6);
        prod3.setCh(4.8);
        prod3.setKcal(64);

        Product prod4 = new Product("apple", 0.4, 0.4, 9.8);
        prod4.setKcal(47);


        //System.out.println(prod1);

        MyProducts list = new MyProducts();
        list.setMaxPr(25);
        list.setMaxFat(65);
        list.setMaxCh(60);
        list.setMaxKcal(700);
        list.addProduct(prod1);
        list.addProduct(prod2);
        list.addProduct(prod3);
        list.addProduct(prod4);
        list.printList();


        //System.out.println(list);
        //System.out.println(list.getMaxCh());

    }
}
