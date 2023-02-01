package pro.sky.java.course2.lesson1.transport;

public class Car {
    public class Key {


        private final boolean remoteEngineStart;
       private final boolean withoutKeyAccess;

        public Key(boolean remoteEngineStart, boolean withoutKeyAccess) {

            this.remoteEngineStart = remoteEngineStart;

            this.withoutKeyAccess = withoutKeyAccess;
        }

    }

    final String brand;
    final String model;
    double engineValue;
    String color;
    final int year;
    final String country;
    //добавили новые свойства
    String transmission;
    final String bodyType;
    int regNumber;
    final int numberOfSeats;
    boolean winterTires;







    public Car(double engineValue,String color, String transmission, int regNumber, boolean winterTires, String brand, String model, int year, String country, String bodyType, int numberOfSeats) {


        this.color = color;
        this.engineValue = engineValue;
        this.transmission = transmission;
        this.regNumber = regNumber;
        this.winterTires = winterTires;

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.bodyType = bodyType;
        this.numberOfSeats =numberOfSeats;


        if (engineValue <= 0) {
            this.engineValue = 1.5;
        }
        if ((color == null) || (color.isEmpty())) {
            this.color = "белый";
        }

    }
//создадим метод для смены резины на зимнюю
    public  void changeTires(int month) {
        if (month == 1 || month == 2 || month == 12) {
           this.winterTires = true;
        }
        else {
            this.winterTires = false;
        }
    }


    public String toString() {
       return "марка " + this.brand + "\n" +  "модель " + this.model + "\n" +"цвет " + this.color + "\n" +  "объем двигателя " + this.engineValue + "\n" + "год выпуска " + this.year +"\n" + "Страна производства " + this.country + "\n"+ "коробка передач " + this.transmission + "\n" + "тип кузова " + this.bodyType + "\n" + "регистрационный номер " + this.regNumber + "\n" + "количество мест " + this.numberOfSeats + "\n" + "зимняя резина " + this.winterTires + "\n\n";

    }
    public String getBrand() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public String getCountry() {
        return this.country;
    }
    public  String getBodyType() {
        return this.bodyType;
    }
    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }
    public double getEngineValue() {
        return this.engineValue;
    }
    public void setEnginevalue(double engineValue) {
        if (engineValue > 0) {
        this.engineValue = engineValue;}
        else { this.engineValue = 5;
        }
    }
    public String getColour() {
        return this.color;
    }
    public void setColour(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
        this.color = color;
        }
        else {
            this.color = "белый";
        }
    }
    public String getTransmission() {
        return this.transmission;
    }
    public void setTransmission(String value) {
        if (value != null && !value.isEmpty() && !value.isBlank()) {
            this.transmission = value;
        }
        else {
            this.transmission = "автомат";
        }
    }

    public int getRegNumber() {
        return this.regNumber;
    }
    public void setRegNumber(int number) {
        if (number <= 0) {
            this.regNumber = 1111;
        }
        else {

            this.regNumber = number;
        }

    }
    public boolean getWinterTires() {
        return this.winterTires;
    }
    public void setWinterTires(boolean value) {
        this.winterTires = value;


    }



}