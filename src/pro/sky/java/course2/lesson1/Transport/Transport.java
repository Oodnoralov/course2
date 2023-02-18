package pro.sky.java.course2.lesson1.Transport;

import pro.sky.java.course2.lesson1.Drivers.*;

public abstract class Transport<T extends Driver> implements Competing {
    private String brand;
    private String model;

    private double engineValue;
    private final T driver;


    public Transport(String brand, String model, double engineValue, T driver) {
        this.brand = brand;
        this.model = model;
        this.engineValue = engineValue;
        this.driver = driver;


    }

    public String toString() {
        return "марка " + this.brand + "\n" +  "модель " + this.model+ "\n" + "Объем двигателя " + this.engineValue;

    }
    public abstract void drive();
    public abstract void stop();
    public T getDriver() {
        return driver;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineValue() {
        return engineValue;
    }

    public void setBrand(String brand) {
        if(!brand.isBlank() && !brand.isEmpty())
        this.brand = brand;
    }

    public void setModel(String model) {
        if(!model.isBlank() && !model.isEmpty())
            this.model = model;
    }

    public void setEngineValue(double engineValue) {
        this.engineValue = engineValue;
    }
    @Override
    public void pitStop() {
        System.out.println("грузовик " + this.getBrand() + " остановился");
    }
    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время гонщика " + getBrand() + " 2.3 мин");
    }
    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость гонщика " + getBrand() + " 370 км/ч");

    }


}
