package com.java.basic.objetos;

public class TicketService {
    private TicketRepository ticketRepository = new TicketRepositoryImp() ;
    public String printExecute(Ticket info ) {

         ticketRepository.print(info);

         return "";
    }
}
