package exercises.chapter3;
import java.util.ArrayList;
import java.util.Scanner;
public class PrintFiveLetters {
 public static void printFiveLetters(ArrayList<String> stringlist) {
     for (int i = 0; i < stringlist.size(); i++) {
         if (stringlist.get(i).length() == 5) {
             System.out.println(stringlist.get(i));
         }
     }
 }
}