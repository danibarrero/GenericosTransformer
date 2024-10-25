package org.iesvdm.Ejercicios;

import org.iesvdm.transformer.JoinByAdding;
import org.iesvdm.transformer.Joiner;
import org.iesvdm.transformer.Joiners;

import java.util.ArrayList;

public class Ejer4 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Create a Joiner object that adds integers using the JoinByAdding implementation
        Joiner<Integer> joiner = new JoinByAdding();

        // Call the zipArrayLists method to join the two lists using the joiner
        ArrayList<Integer> result = Joiners.zipArrayLists(joiner, list1, list2);

        System.out.println("Result: " + result);
    }
}
