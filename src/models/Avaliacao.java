package models;

import exceptions.NotaInvalida;

public class Avaliacao {
    private String usuario;
    private int nota;
    private String comentario;

    public Avaliacao(String usuario, int nota, String comentario) throws NotaInvalida {
        if (nota < 0 || nota > 10) {
            throw new NotaInvalida("A nota não pode ser menor que 0 e nem maior que 10.");
        } else {
            this.nota = nota;
        }
    }

    public int getNota() {
        return this.nota;
    }
}