package pro.sky.java.course2.lesson1;

public class Mechanic {
    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public void maintenance() {
        System.out.println("механик " + name + " из компании " + company + " проводит техобслуживание");
    }
    public void repair() {
        System.out.println("механик " + name + "из компании " + "чинит автомобиль");
    }

    @Override
    public String toString() {
        return
                "Механик: " + name + '\'' +
                "из компании: " + company + '\'';
    }
    //
}
