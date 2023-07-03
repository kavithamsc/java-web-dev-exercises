package org.launchcode.java.demos.lsn7interfaces;

import org.junit.Before;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
        System.out.println("Before:");
        for(Flavor flavor:flavors){
            //System.out.println(flavor.getName());
            System.out.println(flavor.getName() + " number of Allergens: "+flavor.getAllergens().size());
        }
        Comparator comparator = new FlavorComparator();

       // flavors.sort(comparator);
        flavors.sort(new FlavorComparator());
        System.out.println("\nAfter:");
        for(Flavor flavor:flavors){
            //System.out.println(flavor.getName());
            System.out.println(flavor.getName() + " number of Allergens: "+flavor.getAllergens().size());
        }
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        System.out.println("\nBefore:");
        for(Cone cone:cones){
            System.out.println(cone.getName() +": $"+ cone.getCost());
        }
        cones.sort(new ConeComparator());
        System.out.println("\nAfter:");
        for(Cone cone:cones){
            System.out.println(cone.getName() +": $"+ cone.getCost());
        }
        System.out.println("\nBefore:");
        for(Topping topping : toppings){
            System.out.println(topping.getName() +": $"+ topping.getCost());
        }
        toppings.sort(new ToppingComparator());
        System.out.println("\nAfter:");
        for(Topping topping : toppings){
            System.out.println(topping.getName() +": $"+ topping.getCost());
        }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
