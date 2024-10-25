package org.iesvdm.Ejercicios.Ejer7;

import java.util.ArrayList;

import static org.iesvdm.Ejercicios.Ejer7.CheckerUtils.remove;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        remove(new OddNumberChecker(), numbers);
        System.out.println("Odd numbers: " + numbers);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("hola");
        strings.add("adios");
        strings.add("JS");
        strings.add("Anotaciones");

        remove(new LengthChecker(5), strings);
        System.out.println("Strings with length less than 5: " + strings);
    }
}
