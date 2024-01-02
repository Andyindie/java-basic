package com.java.basic.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Payment {
    private Double price;

    /**
     * Se creo el constructor con el objetivo de poder hacer super desde cla clase Ticker, y construir price
     * @param price
     */
    public Payment(Double price) {
        this.price = price;
    }
}
