package pro.sky.java.course2.lesson1.Drivers;

import java.util.Objects;

public abstract class Driver {
    private String name;
    private boolean license;
    private int experience;

    public Driver(String name, boolean license, int experience) {
        this.name = name;
        this.license = license;
        this.experience = experience;
    }
    public String getName() {
        return this.name;
    }
    public boolean isHasDriverLicense() {
        return license;
    }

    @Override
    public String toString() {
        return "водитель  " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return license == driver.license && experience == driver.experience && name.equals(driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, license, experience);
    }
}
