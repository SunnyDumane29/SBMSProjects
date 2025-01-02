package in.sunnyit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sunnyit.binding.Passanger;
import in.sunnyit.binding.Ticket;
import in.sunnyit.repo.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	public TicketRepository ticketrepo;
	
	public Ticket bookticket(Passanger passanger) 
	{
		Ticket t1= new Ticket();
		
		BeanUtils.copyProperties(passanger, t1);
		t1.setTicketStatus("CONFIRMED");
		Ticket savedtickit = ticketrepo.save(t1);
		
		return savedtickit;
	}

	public Ticket getTicket(Integer ticketId) {
		
		Optional<Ticket> ticketFind = ticketrepo.findById(ticketId);
		
		return ticketFind.orElseThrow();
	}


	public List<Ticket> getTickets() {
	
		List<Ticket> AllTickets = ticketrepo.findAll();
		
		return AllTickets;
	}



}
