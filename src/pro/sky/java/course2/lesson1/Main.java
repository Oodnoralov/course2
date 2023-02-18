package pro.sky.java.course2.lesson1;
import pro.sky.java.course2.lesson1.Drivers.DriverBus;
import pro.sky.java.course2.lesson1.Drivers.DriverCar;
import pro.sky.java.course2.lesson1.Drivers.DriverTruck;
import pro.sky.java.course2.lesson1.Transport.*;

public class Main {

    public static void main(String[] args) {

        DriverBus driver1 = new DriverBus("Слава",true, 5);
        DriverCar driver2 = new DriverCar("Игнат", false, 15);
        DriverTruck driver3 = new DriverTruck("Тимофей", true, 21);
        DriverBus driver4 = new DriverBus("Олег",true, 5);
        DriverCar driver5 = new DriverCar("Илья", false, 15);
        DriverTruck driver6 = new DriverTruck("Антон", true, 21);
        DriverBus driver7 = new DriverBus("Гена",true, 5);
        DriverCar driver8 = new DriverCar("Саша", false, 15);
        DriverTruck driver9 = new DriverTruck("Ирина", true, 21);
        DriverBus driver10 = new DriverBus("Ярик",true, 5);
        DriverCar driver11 = new DriverCar("Юра", false, 15);
        DriverTruck driver12 = new DriverTruck("Рома", true, 21);

        Car granta = new Car(
                "Lada",
                "Granta",
                1.6,
                driver2);
        Car audi = new Car(
                "Audi",
                "a4",
                2.5,
                driver5);
        Car bmw = new Car(
                "BMW",
                "m5",
                4.4,
                driver8);
        Car ford = new Car(
                "ford",
                "mustang",
                5.2,
                driver11);

        Bus lotos = new Bus(
                "Лотос",
                "206",
                5.3,
                driver1);
        Bus Daeewoo = new Bus(
                "Daewoo",
                "BC212MA",
                11,
                driver4);
        Bus iveco = new Bus(
                "Iveco",
                "FBI 83 MR",
                3,
                driver7);
        Bus bogdan = new Bus(
                "Богдан",
                "А-30220",
                5.7,
                driver10);

        Truck honguan = new Truck(
                "Honguan",
                "CQ1163TLG461",
                9.7,
                driver3);
        Truck dongfeng = new Truck(
                "Dongfeng",
                "DFA 1120",
                8.3,
                driver6);
        Truck nissan = new Truck(
                "Nissan",
                "146",
                14.6,
                driver9);
        Truck maz = new Truck(
                "МАЗ",
                "5340В9-470-000",
                9,
                driver12);








        String allCars;
        allCars = maz.toString() + "\n\n" + nissan.toString()+ "\n" + dongfeng.toString() + "\n\n" + honguan.toString() + "\n\n" + iveco.toString()+
        bogdan.toString() + "\n\n" + Daeewoo.toString() ;
        //System.out.println(allCars);
        System.out.println("================\n");
        printInfo(maz);
        printInfo(bmw);
        printInfo(ford);
        printInfo(granta);
        printInfo(lotos);
        printInfo(honguan);







        

    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand()+ transport.getModel()+ " И будет участвовать в заезде");
    }



}