package org.example;

import java.util.HashMap;
import java.util.Map;

public class generoFactory {
    private static Map<String, Genero> generos = new HashMap<>();

    public static Genero getGenero(String nome) {
        Genero genero = generos.get(nome);
        if (genero == null) {
            genero = new Genero(nome);
            generos.put(nome, genero);
        }
        return genero;
    }

    public static int getDiferenteGeneros() {
        return generos.size();
    }
}
