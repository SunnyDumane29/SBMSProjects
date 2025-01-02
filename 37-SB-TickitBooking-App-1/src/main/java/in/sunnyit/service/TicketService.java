package in.sunnyit.service;

import java.util.List;

import in.sunnyit.binding.Passanger;
import in.sunnyit.binding.Ticket;

public interface TicketService {
	
	public Ticket bookticket(Passanger passanger); // taking passanger data as input and ticket data as output	
	
	public Ticket getTicket(Integer ticketId); // Get tickit detail as Tickit ID
	
	public List<Ticket> getTickets();// get all the ticket 
	

}
