package pro.sky.java.course2.lesson1;

public class Transport {
    private String brand;
    private String model;
    protected String color;
    private final int year;
    private final String country;
    protected int maxSpeed;

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank() && !color.isBlank()) {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    public Transport(String brand, String model, String color, int year, String country, int maxSpeed) {
       setColor(color);
       setMaxSpeed(maxSpeed);
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;

    }
    public String toString() {
        return "марка " + this.brand + "\n" +  "модель " + this.model + "\n" +"цвет " + this.color + "\n" + "год выпуска " + this.year +"\n" + "Страна производства " + this.country;

    }
}
