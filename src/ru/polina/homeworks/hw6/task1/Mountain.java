package ru.polina.homeworks.hw6.task1;

public class Mountain {
    private String mountainName;
    private String country;
    private int mountainHeight;

    public void setMountainHeight(int height){
        if (height < 100) {
            throw new IllegalArgumentException("высота горы не может быть меньше 100 м");
        }
        mountainHeight = height;
    }
    /*public int getMountainHeight(){
        return mountainHeight;
    }

    public String getCountry() {
        return country;
    }*/

    public void setCountry(String country) {
        if (country == null || country.length() < 4){
            throw new IllegalArgumentException("Название страны не может быть меньше 4 символов");
        }
        this.country = country;
    }

    public String getMountainName() {
        return mountainName;
    }




    public void setMountainName(String mountainName) {
        if (mountainName== null || mountainName.length() < 4){
            throw new IllegalArgumentException("Название горы не может быть меньше 4 символов");
        }
        this.mountainName = mountainName;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "mountainName='" + mountainName + '\'' +
                ", country='" + country + '\'' +
                ", mountainHeight=" + mountainHeight +
                '}';
    }
}
