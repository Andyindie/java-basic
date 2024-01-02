package com.java.basic.domain;


import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.beans.ConstructorProperties;


public class Ticket extends Payment{
    private String titulo;

    /**
     * Se agrego super(price): con el objetivo de construir los atributos de Payment (Es necesario crear el constructor
     * de Payment para poder hacer super(price))
     * @param titulo
     * @param price
     */
    public Ticket(String titulo,double price) {
        super(price);
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
