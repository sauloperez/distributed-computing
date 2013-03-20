package ticket;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService

public interface TicketService {
	@WebMethod public void ticketcreation(String name, int type, int date);
	@WebMethod public void ticketread();
	@WebMethod public void ticketupdate();
	@WebMethod public void ticketdelete();
	@WebMethod public void ticketlists();
	
	

}
