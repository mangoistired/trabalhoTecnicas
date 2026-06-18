package models;

import java.util.Vector;

public abstract class Obra {
    private String titulo;
    private String autor;
    private boolean ativa;
    private Vector<Avaliacao> avaliacoes;
    
    public Obra(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ativa = true;
        this.avaliacoes = new Vector<>(); // inicializando os atributos e colocando o status da obra como ativa
    }
    
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public boolean isAtiva() {
        return this.ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        this.avaliacoes.addElement(avaliacao);
    }

    public double mediaAvaliacoes() {
        if (this.avaliacoes == null || this.avaliacoes.isEmpty()) {
            return 0.0;
        }

        double somaNotas = 0.0;

        for (Avaliacao a : this.avaliacoes) {
            somaNotas += a.getNota();
        }

        return somaNotas/this.avaliacoes.size();
    }

    public abstract String exibirDetalhes();
}
