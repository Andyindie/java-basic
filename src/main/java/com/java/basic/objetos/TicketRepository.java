package com.java.basic.objetos;

import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository {

    String print(Ticket ticket);

}
