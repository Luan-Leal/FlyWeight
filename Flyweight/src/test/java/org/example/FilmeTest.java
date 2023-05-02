package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmeTest {

    @Test
    void testObterFilmeGenero() {
        Genero genero1 = generoFactory.getGenero("Ação");
        Genero genero2 = generoFactory.getGenero("Comédia");
        Filme filme1 = new Filme("Filme A", genero1);
        Filme filme2 = new Filme("Filme B", genero1);
        Filme filme3 = new Filme("Filme C", genero2);

        assertEquals("Filme{nome='Filme A', gênero='Ação'}", filme1.obterFilmeGenero());
        assertEquals("Filme{nome='Filme B', gênero='Ação'}", filme2.obterFilmeGenero());
        assertEquals("Filme{nome='Filme C', gênero='Comédia'}", filme3.obterFilmeGenero());
    }

    @Test
    void testGetGenero() {
        Genero genero1 = generoFactory.getGenero("Ação");
        Genero genero2 = generoFactory.getGenero("Ação");
        Genero genero3 = generoFactory.getGenero("Comédia");

        assertSame(genero1, genero2);
        assertNotSame(genero1, genero3);
        assertEquals(2, generoFactory.getDiferenteGeneros());
    }
}
