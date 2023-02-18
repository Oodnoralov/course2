package pro.sky.java.course2.lesson1.Transport;

import pro.sky.java.course2.lesson1.Drivers.DriverTruck;

public class Truck extends Transport<DriverTruck> {
    public Truck(String brand, String model, double engineValue,DriverTruck driver) {
        super(brand, model, engineValue,driver);

    }
    @Override
    public void drive() {
        System.out.println("Грузовик начал движение");

    }
    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }




}
