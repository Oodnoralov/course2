package pro.sky.java.course2.lesson1.Transport;

import pro.sky.java.course2.lesson1.Drivers.DriverBus;
import pro.sky.java.course2.lesson1.Exceptions.DiagnosticFailedException;

public class Bus extends Transport<DriverBus> {
    public enum Capacity {
        VERYSMALL(0, 10),
        SMALL(0, 25),
        AVERAGE(40,50),
        BIG(60,80),
        VERYBIG(100, 120);
        private final int from;
        private final int to;

        Capacity(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }

        @Override
        public String toString() {
            return "вместимость от " + from + " до " + to;
        }
    }
    private Capacity capacity;
    public Bus(String brand, String model, double enginevalue, DriverBus driver, Capacity capacity) {
        super(brand, model, enginevalue, driver);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void printType() {
        if (capacity != null) {
            System.out.println(capacity);
        }
        else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public void drive() {
        System.out.println("Автобус начал движение");

    }
    @Override
    public void stop() {
        System.out.println("Автобус остановился");
    }
    @Override

    public boolean diagnostic() throws DiagnosticFailedException {
        return false;
    }


}
