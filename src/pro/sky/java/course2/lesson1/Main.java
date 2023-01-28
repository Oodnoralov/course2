package pro.sky.java.course2.lesson1;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada","Granta", 1.7, "Желтый", 2015, "Российская Федерация");
        Car audi = new Car("Audi","A8 50 L TDI quattro",3.0,"Черный", 2020,"Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "Черный", 2021,"Германия");
        Car kia = new Car("KIA","sportage 4 gen",2.4, "Красный",2018, "Южная Корея");
        Car hyundai = new Car("Hyundai","Avante", 1.6, "Оранжевый", 2016, "Южная Корея" );

        String allCars = granta.toString() + audi.toString() + bmw.toString() + kia.toString() + hyundai.toString();
        System.out.println(allCars);
    }
}