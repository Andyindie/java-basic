package com.java.basic.servicio;

import com.java.basic.domain.Ticket;
import com.java.basic.domain.TicketRepository;
import com.java.basic.controller.TicketRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;


    public TicketService() {
        this.ticketRepository = new TicketRepositoryImp();
    }

    public String printExecute(Ticket info) {
        try {

            String valor = (ticketRepository.print(info));
            switch (valor) {
                case "S/N TINTA":
                    System.out.println("S/N TINTA");
                    throw new Exception("ErrorTipo1");

                case "IMPRESION CORRECTA":
                    System.out.println("IMPRESION CORRECTA");
                    return "Se imprimio" + info.toString();

                case ("S/N PAPEL"):
                    System.out.println("S/N PAPEL");
                    throw new Exception("ErrorTipo2");
                // Cuerpo del caso 2
                default:
                    System.out.println(valor);
                    // Cuerpo por defecto
                    break;
            }
        } catch (Exception e) {
            String value = e.getMessage();
            System.out.println(value);

            return "final";
        } finally {
            return "final2";
        }

    }
}
