package exercises.chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class UserSearchItem {

    public static void usersearchitems(ArrayList<String> strngList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a words of length: ");
        int searchLength = input.nextInt();

        for (int i = 0; i < strngList.size(); i++) {
            if (strngList.get(i).length() == searchLength) {
                System.out.println(strngList.get(i));
            }
        }

    }
    }


