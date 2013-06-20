package ticket;

import java.io.*;

import javax.jws.WebMethod;

public class Ticketclass implements TicketService {
	
		

	private static String name;
	private static int type;
	private static int date;

	@Override
	@WebMethod
	public void ticketcreation(String name, int type, int date){
	
		System.out.println("Enter the name:");
		System.out.println("Enter the type of the ticket:" + type);
		System.out.println("Enter the date you want:" + date);
		
		
		
		// TODO Auto-generated method stub

	}

	@Override
	@WebMethod
	public void ticketread() {
		// TODO Auto-generated method stub

	}

	@Override
	@WebMethod
	public void ticketupdate() {
		// TODO Auto-generated method stub

	}

	@Override
	@WebMethod
	public void ticketdelete() {
		// TODO Auto-generated method stub

	}

	@Override
	@WebMethod
	public void ticketlists() {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    Ticketclass tc = new Ticketclass();
		
		tc.ticketcreation(name, type, date);
		
		
		// TODO Auto-generated method stub

	}

}
