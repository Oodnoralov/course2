package pro.sky.java.course2.lesson1;

public class Car {
    String brand;
    String model;
    double engineValue;
    String color;
    int year;
    String country;

    Car(String brand,String model,double engineValue,String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.color= color;
        this.engineValue = engineValue;
        this.year = year;
        this.country = country;
        if ((brand == null) || (brand == "")) {
            this.brand = "deafult";
        }
        if ((model == null) || (model == "")) {
            this.model = "deafult";
        }
        if ((country == null) || (country == "")) {
            this.country = "deafult";
        }
        if (engineValue <= 0) {
            this.engineValue = 1.5;
        }
        if ((color == null) || (color == "")) {
            this.color = "белый";
        }
        if (year < 0) {
            this.year = 2000;
        }
    }

    public String toString() {
        return "марка " + this.brand + "\n" +  "модель " + this.model + "\n" +"цвет " + this.color + "\n" +  "объем двигателя " + this.engineValue + "\n" + "год выпуска " + this.year +"\n" + "Страна производства " + this.country + "\n\n";

    }

}