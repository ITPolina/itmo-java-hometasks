package ru.polina.homeworks.hw6.task1;

public class Alpinist {
    private String name;
    private String address;

    /*public void printFullCharsOfAlp(){
        System.out.println(name + " " + address);
    }

    public String getFullCharsOfAlp(){
        return name + " " + address;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3){
            throw new IllegalArgumentException("Имя альпиниста не может быть меньше 3 символов");
        }
        this.name = name;
    }

    /*public String getAddress() {
        return address;
    }*/

    public void setAddress(String address) {
        if (address == null || address.length() < 5){
            throw new IllegalArgumentException("Адрес альпиниста не может быть меньше 5 символов");
        }
        this.address = address;
    }

    @Override
    public String toString() {
        return "Alpinist{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
