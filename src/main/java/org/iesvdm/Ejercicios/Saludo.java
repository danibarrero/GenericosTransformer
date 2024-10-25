package org.iesvdm.Ejercicios;

import org.iesvdm.transformer.Transformer;

public class Saludo implements Transformer<String> {

    private String saludo;

    public Saludo(String saludo) {
        this.saludo = saludo;
    }

    @Override
    public String transform(String obj) {
        return saludo + " " + obj;
    }
}