package com.java.basic.controller;

import com.java.basic.domain.Ticket;
import com.java.basic.domain.TicketRepository;
import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository()
public class TicketRepositoryImp implements TicketRepository {


    @Override
    public String print(Ticket ticket) {
        final String[] status ={"S/N TINTA","IMPRESION CORRECTA","S/N PAPEL",""} ;
        Random random = new Random();
        int aleatorio = random.nextInt(status.length);

        return status[aleatorio];
    }
}
