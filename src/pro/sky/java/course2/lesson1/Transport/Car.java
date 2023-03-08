package pro.sky.java.course2.lesson1.Transport;

import pro.sky.java.course2.lesson1.Drivers.DriverCar;
import pro.sky.java.course2.lesson1.Exceptions.DiagnosticFailedException;

public class Car extends Transport<DriverCar>  {
    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("хэтчбэк"),
        COUPE("купе"),
        UNIVERSAL("универсал"),
        OFFROAD("внедорожник"),
        CROSSOVER("кроссовер"),
        PICKUP("пикап"),
        WAGON("фургон"),
        MINIVAN("минивен");
        private final String name;
        BodyType(String name){
            this.name = name;
        }
        public String toString() {
            return "тип кузова: " + name;
        }
    }
    private BodyType bodyType;

    public Car(String brand, String model, double engineValue, DriverCar driver, BodyType bodyType) {
        super(brand, model, engineValue, driver);
        this.bodyType = bodyType;





    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void printType() {
        if (bodyType != null) {
            System.out.println(bodyType);
        }
        else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public void drive() {

        System.out.println("Автомобиль начал движение!");
    }
    @Override
    public void stop() {
        System.out.println("Автомобиль остановился");
    }

    @Override
    public boolean diagnostic() throws DiagnosticFailedException {
if (getDriver() != null && getDriver().isHasDriverLicense()) {
    return true;
}
else {
    throw new DiagnosticFailedException();
}
    }


}