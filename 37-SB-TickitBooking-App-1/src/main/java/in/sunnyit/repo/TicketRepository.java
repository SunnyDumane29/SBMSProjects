package in.sunnyit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sunnyit.binding.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
