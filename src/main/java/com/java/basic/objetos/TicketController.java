package com.java.basic.objetos;

public class TicketController {

    private TicketService ticketService;
    public TicketController(){
        this.ticketService = new TicketService();
    }
    public String postPrint(Ticket info ) {
        //HAGO LAS VALIDACIONES
        return ticketService.printExecute(info);
    }
}
