package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.List;

public class Transformers  {
    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a) {
        ArrayList<T> b = new ArrayList<>();
        for(T t : a)
            b.add(tran.transform(t));
        return b;
    }

    /* Destructively */
    public static <T> void applyDest(Transformer<T> tran, ArrayList<T> a) {
        // Recorrer la lista
        for (int i = 0; i < a.size(); i++) {
            // Reemplaza el elemento en la posición actual
            a.set(i, tran.transform(a.get(i)));
        }
    }

    public static <T> List<T> transformList(Transformer<T> tran, LispList<T> l) {
        List<T> lista = new ArrayList<>();

        if (l.isEmpty()) {
            System.out.println("Empty list");
        } else {
            while (!l.isEmpty()) {
                lista.add(tran.transform(l.head()));
                l = l.tail();
            }
        }
        return lista;
    }
}

