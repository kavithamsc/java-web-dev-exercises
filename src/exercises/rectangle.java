package exercises;

import java.util.Scanner;
public class rectangle {
    public static void main(String[] args){
        double length;
        double width;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("please enter the length of the rectangle: ");
        length = input.nextDouble();

        System.out.println("please enter the width of the rectangle");
        width = input.nextDouble();
        input.close();

        area = length*width;
        System.out.println("Area of the rectangle is "+ area +"cm^2");

    }
}
