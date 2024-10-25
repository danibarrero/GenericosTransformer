package org.iesvdm.transformer;


import java.util.ArrayList;

public class Joiners  {
    public static <T> LispList<T> zipLists(Joiner<T> joiner,LispList<T> ls1,LispList<T> ls2) {
        if(ls1.isEmpty()||ls2.isEmpty())
            return LispList.empty();
        else
        {
            T h = joiner.join(ls1.head(),ls2.head());
            LispList<T> t = zipLists(joiner,ls1.tail(),ls2.tail());
            return t.cons(h);
        }
    }

    public static <T> ArrayList<T> zipArrayLists(Joiner<T> joiner,ArrayList<T> ls1,ArrayList<T> ls2) {
        ArrayList list = new ArrayList();
        // Define el tamaño mínimo entre las 2 listas
        int tamaño = Math.min(ls1.size(),ls2.size());

        for (int i = 0; i < tamaño; i++) {
            // Usa joiner para unir los elementos de las 2 listas
            list.add(joiner.join(ls1.get(i),ls2.get(i)));
        }

        return list;
    }

    public static <T> T fold(ArrayList<T> list, Joiner<T> joiner) {
        if (list.isEmpty()) {
            return null;
        }

        T result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result = joiner.join(result, list.get(i)); // join the elements
        }
        return result;
    }
}