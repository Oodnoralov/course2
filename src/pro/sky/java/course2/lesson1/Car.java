package pro.sky.java.course2.lesson1;

public class Car extends Transport {
    double engineValue;
    public Car(String brand, String model, String color, int year, String country, int maxSpeed, double engineValue) {
        super(brand, model, color, year, country, maxSpeed);
        this.engineValue = engineValue;


    }


}