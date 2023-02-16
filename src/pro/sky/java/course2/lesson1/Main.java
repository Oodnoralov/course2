package pro.sky.java.course2.lesson1;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada","Granta","yellow", 2015, "Russia", 260, 1.6);
        Car audi = new Car("Audi","a4", "Black", 2017, "Germany", 340, 2.5);
        Car bmw = new Car("BMW","m5", "red", 2020, "Germany", 400, 4.4);
        Car ford = new Car("ford", "mustang", "white", 2010, "USA", 370, 5.2);
        Car greatwall = new Car("GreateWall", "Hover", "green", 2011, "Chine", 250,2.2);
        Bus fordTransit = new Bus("Ford", "Transit", "white", 2015, "USA", 160);
        Bus scania = new Bus("Scania", "Higer", "silver", 2011, "Sweden", 220);
        Bus paz = new Bus("ПАЗ", "3204", "white", 2015, "Россия", 160);


        System.out.println(granta + "\n" + "объем двигателя " + granta.engineValue + "\n");
        System.out.println(audi + "\n" + "объем двигателя " + audi.engineValue + "\n");
        System.out.println(bmw + "\n" + "объем двигателя " + bmw.engineValue + "\n");
        System.out.println(ford + "\n" + "объем двигателя " + ford.engineValue + "\n");
        System.out.println(greatwall + "\n" + "объем двигателя " + greatwall.engineValue);
        System.out.println(fordTransit + "\n");
        System.out.println(scania + "\n");
        System.out.println(paz);


        

    }

}