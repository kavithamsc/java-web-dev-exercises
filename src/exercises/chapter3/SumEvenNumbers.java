package exercises.chapter3;
import java.util.ArrayList;
public class SumEvenNumbers {
    public static int sumEvenNumbers(ArrayList<Integer> arr) {
        int total = 0;
        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                System.out.println(arr.get(i));
                total += arr.get(i);
            }
        }
        return total;
    }
}
