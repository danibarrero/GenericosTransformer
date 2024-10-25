package org.iesvdm.Ejercicios;

import org.iesvdm.transformer.JoinByAdding;
import org.iesvdm.transformer.Joiner;
import org.iesvdm.transformer.Joiners;
import org.iesvdm.transformer.LispList;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LispList<Integer> ls1, ls2, ls3; // Declares three lists of integers

        System.out.print("Enter a list (of integers): ");
        String str = in.nextLine();
        ls1 = parseIntLispList(str); // Converts the entered string into a LispList of integers

        // Enter another list of integers
        System.out.print("Enter another list (of integers): ");
        str = in.nextLine();
        ls2 = parseIntLispList(str);

        Joiner<Integer> adder = new JoinByAdding();

        // Uses the zipLists method to sum the corresponding elements of both lists
        ls3 = Joiners.zipLists(adder, ls1, ls2);

        System.out.println("Adding corresponding integers in the lists gives:\n" + ls3);
    }

    public static LispList<Integer> parseIntLispList(String str) {
        String line = str.trim(); // Removes spaces from the beginning and end of the string
        String contents = line.substring(1, line.length() - 1).trim(); // Removes the brackets []

        // If the string is empty, returns an empty list
        if (contents.length() == 0)
            return LispList.empty();

        // Splits the string into elements using the comma as a separator
        String[] nums = contents.split(",");
        LispList<Integer> list = LispList.empty();

        // Iterates through the elements in reverse order and adds them to the list
        for (int i = nums.length - 1; i >= 0; i--) {
            String num = nums[i].trim(); // Removes spaces from each number
            list = list.cons(Integer.parseInt(num)); // Converts to integer and adds to the list
        }

        return list; // Returns the list of integers
    }
}
