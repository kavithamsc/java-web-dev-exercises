package exercises.chapter3;
 import java.util.ArrayList;


 import static exercises.chapter3.PrintFiveLetters.printFiveLetters;
 import static exercises.chapter3.SumEvenNumbers.sumEvenNumbers;
 import static exercises.chapter3.UserSearchItem.usersearchitems;

public class ArrayListPractice {
    public static void main(String[] args) {
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(2);
//        nums.add(4);
//        nums.add(6);
//        nums.add(5);
//        nums.add(9);
//        nums.add(13);
//        nums.add(15);
//        nums.add(17);
//        nums.add(22);
//        nums.add(25);
//        System.out.println("ArrayList is:"+ nums);
//        int sum =sumEvenNumbers(nums);
//        System.out.println(sum);
        ArrayList<String> words = new ArrayList<>();
        words.add("dogs");
        words.add("monkey");
        words.add("Horse");
      System.out.println("ArrayList of words is: "+ words);
      printFiveLetters(words);
        System.out.println("ArrayList of words is: "+ words);
        usersearchitems(words);
    }
}




