package com.java.basic;

import com.java.basic.domain.Ticket;
import com.java.basic.controller.TicketController;

import java.util.*;


public class JavaBasicApplication {

	public static void main(String[] args) {

		TicketController ticketController = new TicketController();

		List<Ticket> list = new ArrayList<Ticket>();
		Set<Ticket> setList = new HashSet<>() ;
		Map<String,Ticket> mapList = new HashMap<>() ;

		list.add(new Ticket("ticket1",0.0));
		list.add(new Ticket("ticket1",0.0));
		list.add(new Ticket("ticket12",0.0));
		list.add(new Ticket("ticket14",0.0));
		list.add(new Ticket("ticket13",0.0));
		setList.add(new Ticket("ticket1",0.0));
		setList.add(new Ticket("ticket1",0.0));
		setList.add(new Ticket("ticket12",0.0));
		setList.add(new Ticket("ticket14",0.0));
		setList.add(new Ticket("ticket13",0.0));
		mapList.put("1",new Ticket("ticket1",0.0));
		mapList.put("2",new Ticket("ticket1",0.0));
		mapList.put("3",new Ticket("ticket2",0.0));
		mapList.put("4",new Ticket("ticket1ñ",0.0));
		mapList.put("5",new Ticket("ticket1k",0.0));


		for(int i = 0 ; i < list.size(); i++ ){
			Ticket ticket =  list.get(i);
			ticketController.postPrint(ticket);

		}

		for(Ticket ticket : list){
			ticketController.postPrint(ticket);


		}


	}
}
