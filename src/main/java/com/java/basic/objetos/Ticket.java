package com.java.basic.objetos;

public class Ticket extends Payment{
    private String titulo;

    public Ticket(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
