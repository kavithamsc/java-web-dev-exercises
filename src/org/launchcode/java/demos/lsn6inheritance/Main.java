package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args){

    HouseCat garfield = new HouseCat("Garfield", 12);
    garfield.eat();
    System.out.println(garfield.isTired());
        HouseCat spike = new HouseCat("Spike" ,13);
    System.out.println(spike.getWeight());
        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);
    System.out.println(plainCat.noise());
    System.out.println(cheshireCat.noise());
        Cat suki = new HouseCat("Suki", 8);
        suki.noise();
        System.out.println(suki.noise());

        ((HouseCat) suki).isSatisfied();
        System.out.println(((HouseCat) suki).isSatisfied());
}
}

