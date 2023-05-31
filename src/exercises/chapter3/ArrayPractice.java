package exercises.chapter3;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //print the all values of array
        int[] numbers = {1, 1, 2, 3, 5, 8};
        for (int i : numbers) {
            System.out.println(i);
        }
        // print the odd number of the array
        System.out.println("Odd Numbers:");
        for( int i =0; i <numbers.length; i++){
            if(numbers[i]%2 == 1){
                System.out.println(numbers[i]);
            }
        }
    //String Method:
        String str = "I would not, could not, in a box. I would not, could not with a fox." + " I will not eat them in a house. I will not eat them with a mouse.";
        String[] words =str.split(" ");
        System.out.println(Arrays.toString(words));
        String[] word =str.split(" \\.");
        System.out.println(Arrays.toString(word));

    }
}
