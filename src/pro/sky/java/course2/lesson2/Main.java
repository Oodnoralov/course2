package pro.sky.java.course2.lesson2;

import pro.sky.java.course2.lesson2.transport.Car;


public class Main {
    public static void main(String[] args) {
        Car granta = new Car(4,"","auto",0,true, "Lada", "Granta", 2015, "Russia", "sedan", 5);

      granta.setEnginevalue(-2.7);
      granta.changeTires(7);
      granta.new Key(true, false);

        System.out.println(granta.toString());






    }

}