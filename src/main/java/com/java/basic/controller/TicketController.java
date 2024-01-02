package com.java.basic.controller;

import com.java.basic.domain.Ticket;
import com.java.basic.servicio.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TicketController {


    @Autowired
    private TicketService ticketService;

    public TicketController() {
        this.ticketService = new TicketService();
    }

    public String postPrint(Ticket info ) {
        //HAGO LAS VALIDACIONES
        return ticketService.printExecute(info);
    }
}
