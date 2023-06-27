package exercises.technology.main;

import java.util.Objects;

public class Computer {
    private String brand;
    private String color;
    private int year;



    public Computer(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }
    public int processTwoPlusTwo(){
        return 2+2;
    }

    public void reasonOfComputer(){
        System.out.println("My Computer is very Slow Because It's Old.");
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

