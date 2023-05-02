package org.example;

public class Filme {

    private String nome;
    private Genero generoFilme;

    public Filme(String nome, Genero generoFilme) {
        this.nome = nome;
        this.generoFilme = generoFilme;
    }

    public String obterFilmeGenero() {
        return "Filme{" +
                "nome='" + this.nome + '\'' +
                ", gênero='" + generoFilme.getGenero() + '\'' +
                '}';
    }
}
