package com.java.basic.objetos;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@Component
public class TicketRepositoryImp implements TicketRepository {


    @Override
    public String print(Ticket ticket) {
        return "impreso Sin tinta";
    }
}
