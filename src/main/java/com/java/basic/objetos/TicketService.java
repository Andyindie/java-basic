package com.java.basic.objetos;

public class TicketService {
    private TicketRepository ticketRepository;
    public TicketService(){
        this.ticketRepository = new TicketRepositoryImp();
    }
    public String printExecute(Ticket info) {
        try {

            switch ( (ticketRepository.print(info)) ) {
                case "impreso Sin tinta":
                    System.out.println(2);
                    throw new Exception("ErrorTipo2");

                case "impresion correcta":
                    System.out.println(6);
                    return "Se imprimio" + info.toString();

                case ("impreso sin papel"):
                    System.out.println(3
                    );break;
                // Cuerpo del caso 2
                default:
                    System.out.println(4);
                    // Cuerpo por defecto
                    break;
            }
        }catch(Exception e) {
            String value = e.getMessage();
            System.out.println(value);

            return "final";
        }finally {
            return "final2";
        }

    }
}
