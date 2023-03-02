package pro.sky.java.course2.lesson1;
import pro.sky.java.course2.lesson1.Drivers.Driver;
import pro.sky.java.course2.lesson1.Drivers.DriverBus;
import pro.sky.java.course2.lesson1.Drivers.DriverCar;
import pro.sky.java.course2.lesson1.Drivers.DriverTruck;
import pro.sky.java.course2.lesson1.Exceptions.DiagnosticFailedException;
import pro.sky.java.course2.lesson1.Transport.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
//
        Car granta = new Car(
                "Lada",
                "Granta",
                1.6,
                driver2, Car.BodyType.SEDAN);
        Car audi = new Car(
                "Audi",
                "a4",
                2.5,
                driver5, Car.BodyType.SEDAN);
        Car bmw = new Car(
                "BMW",
                "m5",
                4.4,
                driver8, Car.BodyType.SEDAN);
        Car ford = new Car(
                "ford",
                "mustang",
                5.2,
                driver11, Car.BodyType.SEDAN);

        Bus lotos = new Bus(
                "Лотос",
                "206",
                5.3,
                driver1, Bus.Capacity.SMALL);
        Bus Daeewoo = new Bus(
                "Daewoo",
                "BC212MA",
                11,
                driver4, Bus.Capacity.AVERAGE);
        Bus iveco = new Bus(
                "Iveco",
                "FBI 83 MR",
                3,
                driver7, Bus.Capacity.BIG);
        Bus bogdan = new Bus(
                "Богдан",
                "А-30220",
                5.7,
                driver10, Bus.Capacity.SMALL);

        Truck honguan = new Truck(
                "Honguan",
                "CQ1163TLG461",
                9.7,
                driver3, Truck.Carrying.N1);
        Truck dongfeng = new Truck(
                "Dongfeng",
                "DFA 1120",
                8.3,
                driver6, Truck.Carrying.N2);
        Truck nissan = new Truck(
                "Nissan",
                "146",
                14.6,
                driver9, Truck.Carrying.N1);
        Truck maz = new Truck(
                "МАЗ",
                "5340В9-470-000",
                9,
                driver12, Truck.Carrying.N3);
        try {
            lotos.diagnostic();
        } catch (DiagnosticFailedException e) {
            e.printStackTrace();
        }

        Mechanic mechanic1 = new Mechanic("Илья", "company");
        Mechanic mechanic2 = new Mechanic("Игорь", "company");
        Mechanic mechanic3 = new Mechanic("Глеб", "company");

        lotos.addMechanic(mechanic1);
        iveco.addMechanic(mechanic2);
        //ford.addMechanic(mechanic3);
        List<Driver> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        drivers.add(driver4);
        drivers.add(driver5);
        drivers.add(driver6);
        drivers.add(driver7);
        drivers.add(driver8);
        drivers.add(driver9);
        drivers.add(driver10);
        drivers.add(driver11);
        drivers.add(driver12);
        List<Transport<?>> cars = new ArrayList<>();
        cars.add(lotos);
        cars.add(iveco);
        cars.add(ford);
        Set<Driver> driverlist = new HashSet<>();
        driverlist.add(driver1);
        driverlist.add(driver2);
        driverlist.add(driver4);
        driverlist.add(driver6);
        driverlist.add(new DriverTruck("Антон", true, 21));

        Object[] driverArr = driverlist.toArray();
        for (int i = 0; i < driverArr.length; i++) {
            System.out.println(driverArr[i]);
        }








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
        System.out.println(Car.BodyType.COUPE.toString());
        for (Transport<?> transport: cars) {
            System.out.println(transport + "\n" + transport.getDriver() + "" + transport.getMechanics());
        }
        Station station = new Station();
        station.addTransport(lotos);
        station.addTransport(iveco);
        station.addTransport(ford);
        station.service();
        station.service();
        station.service();








        

    }


    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand()+ transport.getModel()+ " И будет участвовать в заезде");
    }



}