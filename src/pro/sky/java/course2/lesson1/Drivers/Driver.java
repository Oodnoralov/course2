package pro.sky.java.course2.lesson1.Drivers;

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
}
