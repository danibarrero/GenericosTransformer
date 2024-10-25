package org.iesvdm.transformer;

import org.iesvdm.Ejercicios.Saludo;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaludoTest {
    @Test
    public void testTransformList() {
        LispList<String> l = new LispList<>(new LispList.Cell<>("Dani", new LispList.Cell<>("Pepe", new LispList.Cell<>("Juan", null))));
        Saludo saludo = new Saludo("Hola");
        List<String> listaAnhadida = Transformers.transformList(saludo, l);
        assertEquals(Arrays.asList("Hola Dani", "Hola Pepe", "Hola Juan"), listaAnhadida);
    }

}
