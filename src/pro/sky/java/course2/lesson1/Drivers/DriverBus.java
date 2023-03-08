package pro.sky.java.course2.lesson1.Drivers;

import pro.sky.java.course2.lesson1.Transport.Bus;

public class DriverBus extends Driver {
    private String name;
    private boolean license;
    private int experience;

    public DriverBus(String name, boolean license, int experience) {
        super(name, license,experience);
        this.name = name;
        this.license = license;
        this.experience = experience;
    }

    public void startDrive() {};
    public void stopDrive() {};
    public void fuelStay() {};
}
