package org.iesvdm.Ejercicios.Ejer8;

import org.iesvdm.transformer.Joiner;

import java.util.ArrayList;

public class JoinerString implements Joiner<String> {

    public String join(String a, String b) {
        return a + " " + b;
    }
}
