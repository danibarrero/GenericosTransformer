package org.iesvdm.Ejercicios;

import org.iesvdm.transformer.TenTimes;
import org.iesvdm.transformer.Transformer;
import org.iesvdm.transformer.Transformers;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer1 {

    /*
     * Prompts the user to enter several integers on a single line, separated by spaces.
     * Splits into an array of strings.
     * Converts each string into an integer and stores it in an ArrayList.
     * Uses an object of the TenTimes class to multiply each number by 10.
     * Applies the transformation and stores the results in another ArrayList.
     * Prints the resulting list of multiplied numbers.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some numbers (all on one line, separated by spaces):");
        String line = input.nextLine();
        String[] numbers = line.split(" ");
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++)
            a.add(new Integer(numbers[i]));
        System.out.println("The numbers are stored in an ArrayList: "+a);
        Transformer<Integer> trans = new TenTimes();
        ArrayList<Integer> b = Transformers.applyConst(trans, a);
        System.out.println("Multiplying the contents by 10 gives: "+b);
    }
}
