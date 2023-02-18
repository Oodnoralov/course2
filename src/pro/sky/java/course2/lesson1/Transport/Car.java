package pro.sky.java.course2.lesson1.Transport;

import pro.sky.java.course2.lesson1.Drivers.DriverCar;

public class Car extends Transport<DriverCar>  {


    public Car(String brand, String model, double engineValue, DriverCar driver) {
        super(brand, model, engineValue, driver);





    }
    @Override
    public void drive() {

        System.out.println("Автомобиль начал движение!");
    }
    @Override
    public void stop() {
        System.out.println("Автомобиль остановился");
    }


}