package org.iesvdm.Ejercicios.Ejer7;

public class LengthChecker implements Checker<String> {
    private final int maxLength;

    public LengthChecker(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean check(String item) {
        return item.length() < maxLength;
    }
}
