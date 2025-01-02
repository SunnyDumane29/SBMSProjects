package in.sunnyit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sunnyit.binding.Passanger;
import in.sunnyit.binding.Ticket;
import in.sunnyit.service.TicketService;

@RestController
public class TicketRestController {
	
	
	@Autowired
	private  TicketService ticketService;
	
	
	@PostMapping(value = "/ticket",consumes = "application/json",produces = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger passanger)
	{
		Ticket ticket = ticketService.bookticket(passanger);
		
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
		
	}
	
	@GetMapping (value = "/ticket/{ticketId}", produces = "application/json")
	public ResponseEntity<Ticket> getTicket(@PathVariable ("ticketId") Integer ticketId)
	{
		Ticket ticket = ticketService.getTicket(ticketId);
		
		return new ResponseEntity<>(ticket,HttpStatus.OK);
	}
	
	@GetMapping (value = "/tickets", produces = "application/json")
	public ResponseEntity<List<Ticket>> getAllTicket ()
	{
		List<Ticket> tickets = ticketService.getTickets();
		
		return new ResponseEntity<> (tickets,HttpStatus.OK);
	}
	

}
