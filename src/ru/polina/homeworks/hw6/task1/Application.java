package ru.polina.homeworks.hw6.task1;

public class Application {
    public static void main(String[] args) {
        Alpinist alp1 = new Alpinist();
        Alpinist alp2 = new Alpinist();
        Alpinist alp3 = new Alpinist();
        Alpinist alp4 = new Alpinist();
        Alpinist alp5 = new Alpinist();
        Alpinist alp6 = new Alpinist();
        Alpinist alp7 = new Alpinist();

        alp1.setName("Fred");
        alp1.setAddress("Ul.Motrosova");
        alp2.setName("Mike");
        alp2.setAddress("Ul.Lomonosova");
        alp3.setName("Tommy");
        alp3.setAddress("ul.Frunze");
        alp4.setName("Den");
        alp4.setAddress("ul.Rubinshteina");
        alp5.setName("Maks");
        alp5.setAddress("ul.Lensoveta");
        alp6.setName("Kir");
        alp6.setAddress("ul.Chaikovskogo");
        alp7.setName("Igor");
        alp7.setAddress("ul.Smolenskaya");



       //alp1.printFullCharsOfAlp();

        //String fullalp1 = alp1.getFullCharsOfAlp();

        Mountain m1 = new Mountain();
        Mountain m2 = new Mountain();
        Mountain m3 = new Mountain();

        m1.setMountainHeight(5165);
        m2.setMountainHeight(2243);
        m3.setMountainHeight(1234);

        //System.out.println(m2.getMountainHeight());
        m1.setCountry("Turkey");
        m2.setCountry("Sri Lanka");
        m3.setCountry("Austria");

        m1.setMountainName("Ararat");
        m2.setMountainName("Adam's peak");
        m3.setMountainName("Ai Petri");


        //System.out.println(m1);

        Group group1 = new Group();
        group1.setM(m1);
        group1.addAlp(alp1);
        group1.addAlp(alp2);
        group1.addAlp(alp3);

        Group group2 = new Group();
        group2.setM(m2);
        group2.addAlp(alp4);
        group2.addAlp(alp5);

        Group group3 = new Group();
        group3.setM(m3);
        group3.addAlp(alp6);
        group3.addAlp(alp7);


        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);


    }
}
