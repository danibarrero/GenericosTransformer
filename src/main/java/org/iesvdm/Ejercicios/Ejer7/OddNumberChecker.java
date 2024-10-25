package org.iesvdm.Ejercicios.Ejer7;

public class OddNumberChecker implements Checker<Integer> {
    public boolean check(Integer item) {
        return item % 2 != 0;
    }
}
