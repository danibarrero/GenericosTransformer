package org.iesvdm.Ejercicios.Ejer8;

import org.iesvdm.transformer.Joiners;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hola");
        strings.add("Adios");
        strings.add("JS");
        strings.add("Anotaciones");

        JoinerString joiner = new JoinerString();
        System.out.println(Joiners.fold(strings, joiner));
    }
}
