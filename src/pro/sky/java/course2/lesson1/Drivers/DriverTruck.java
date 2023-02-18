package pro.sky.java.course2.lesson1.Drivers;

import pro.sky.java.course2.lesson1.Transport.Truck;

public class DriverTruck extends Driver {
    private String name;
    private boolean license;
    private int experience;

    public DriverTruck (String name, boolean license, int experience) {
        super(name, license,experience);
        this.name = name;
        this.license = license;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }
}
