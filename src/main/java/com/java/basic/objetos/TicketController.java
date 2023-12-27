package com.java.basic.objetos;

public class TicketController {

    private TicketService ticketService;
    public String postPrint(Ticket info ) {
        //HAGO LAS VALIDACIONES
        return ticketService.printExecute(info);
    }
}
