package exercises;
 import java.util.Scanner;
public class Miles {
    public static void main(String[] args) {
         double numMiles;
         double numGallon;
         double mpg;
         Scanner input;

         input = new Scanner(System.in);
         System.out.println("how many miles did you drive?");
         numMiles = input.nextDouble();

         System.out.println("how much gas did you used in gallon? ");
         numGallon = input.nextDouble();
         input.close();

         mpg = numMiles / numGallon;
         System.out.println("Total number of gas used for per miles "+ mpg + "mpg");


    }
}
