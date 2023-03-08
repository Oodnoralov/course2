package pro.sky.java.course2.lesson1.Drivers;

import pro.sky.java.course2.lesson1.Transport.Car;

public class DriverCar extends Driver{
    private String name;
    private boolean license;
    private int experience;

    public DriverCar(String name, boolean license, int experience) {
        super(name, license,experience);
        this.name = name;
        this.license = license;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }
}
