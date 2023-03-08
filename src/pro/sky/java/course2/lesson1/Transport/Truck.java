package pro.sky.java.course2.lesson1.Transport;

import pro.sky.java.course2.lesson1.Drivers.DriverTruck;
import pro.sky.java.course2.lesson1.Exceptions.DiagnosticFailedException;

public class Truck extends Transport<DriverTruck> {
    public enum Carrying {
        N1(0.0f, 3.5f),
        N2(3.5f, 12.0f),
        N3(12.0f, null);
        private final Float min;
        private final Float max;

        Carrying(Float min, Float max) {
            this.min = min;
            this.max = max;


        }

        public Float getMin() {
            return min;
        }

        public Float getMax() {
            return max;
        }

        @Override
        public String toString() {
            if (max != null) {
                return "грузоподъемность от : " + min + " тонн " + "до " + min;
            } else {
                return "грузоподъемность от : " + min;
            }
        }
    }

    private Carrying carrying;

    public Truck(String brand, String model, double engineValue, DriverTruck driver, Carrying carrying) {
        super(brand, model, engineValue, driver);
        this.carrying = carrying;

    }

    public Carrying getCarrying() {
        return carrying;
    }

    public void setCarrying(Carrying carrying) {
        this.carrying = carrying;
    }

    @Override
    public void printType() {
        if (carrying != null) {
            System.out.println(carrying);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public void drive() {
        System.out.println("Грузовик начал движение");

    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public boolean diagnostic() throws DiagnosticFailedException {
        if (getDriver() != null && getDriver().isHasDriverLicense()) {
            return true;
        } else {
            throw new DiagnosticFailedException();
        }


    }
}
