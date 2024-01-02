package com.java.basic.domain;

import com.java.basic.domain.Ticket;
import org.springframework.stereotype.Repository;

@Repository()
public interface TicketRepository {


    String print(Ticket ticket);

}
