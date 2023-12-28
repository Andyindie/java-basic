package com.java.basic.objetos;

public class TicketRepositoryImp implements TicketRepository{


    @Override
    public String print(Ticket ticket) {
        return "impreso Sin tinta";
    }
}
