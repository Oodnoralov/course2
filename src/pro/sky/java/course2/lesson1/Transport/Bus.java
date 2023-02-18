package pro.sky.java.course2.lesson1.Transport;

import pro.sky.java.course2.lesson1.Drivers.DriverBus;

public class Bus extends Transport<DriverBus> {
    public Bus(String brand, String model, double enginevalue, DriverBus driver) {
        super(brand, model, enginevalue, driver);
    }

    @Override
    public void drive() {
        System.out.println("Автобус начал движение");

    }
    @Override
    public void stop() {
        System.out.println("Автобус остановился");
    }

}
