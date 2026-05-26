package models;

import java.util.Vector;

public class Obra {
    private String titulo;
    private String autor;
    private boolean ativa;
    private Vector<String> avaliacoes;
    
    public Obra(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ativa = true;
        this.avaliacoes = new Vector<>();
    }
    
}
