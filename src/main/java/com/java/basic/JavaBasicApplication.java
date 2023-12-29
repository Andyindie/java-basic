package com.java.basic;

import com.java.basic.objetos.Ticket;
import com.java.basic.objetos.TicketController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;


public class JavaBasicApplication {

	public static void main(String[] args) {

		TicketController ticketController = new TicketController();

		List<Ticket> list = new ArrayList<Ticket>();
		Set<Ticket> setList = new HashSet<>() ;
		Map<String,Ticket> mapList = new HashMap<>() ;

		list.add(new Ticket("ticket1"));
		list.add(new Ticket("ticket1"));
		list.add(new Ticket("ticket12"));
		list.add(new Ticket("ticket14"));
		list.add(new Ticket("ticket13"));


		setList.add(new Ticket("ticket1"));
		setList.add(new Ticket("ticket1"));
		setList.add(new Ticket("ticket12"));
		setList.add(new Ticket("ticket14"));
		setList.add(new Ticket("ticket13"));


		mapList.put("1",new Ticket("ticket1"));
		mapList.put("2",new Ticket("ticket1"));
		mapList.put("3",new Ticket("ticket2"));
		mapList.put("4",new Ticket("ticket1ñ"));
		mapList.put("5",new Ticket("ticket1k"));


		for(int i = 0 ; i < list.size(); i++ ){
			Ticket ticket =  list.get(i);
			ticketController.postPrint(ticket);

		}

		for(Ticket ticket : list){
			ticketController.postPrint(ticket);


		}


	}
}
