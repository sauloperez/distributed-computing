package ua.be.dc.services.ticketService.db.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.ticketService.db.mappers.TicketMapper;
import ua.be.dc.services.ticketService.models.Ticket;

public class TicketDAO extends BasicDAO {

	public Ticket selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			TicketMapper mapper = session.getMapper(TicketMapper.class);
			Ticket ticket = mapper.selectById(id);

			return ticket;
		} finally {
			session.close();
		}
	}

	public List<Ticket> selectAll() {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			TicketMapper mapper = session.getMapper(TicketMapper.class);
			List<Ticket> tickets = mapper.selectAll();

			return tickets;
		} finally {
			session.close();
		}
	}
	
	public List<Ticket> selectByEventId(Integer eventId) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			TicketMapper mapper = session.getMapper(TicketMapper.class);
			List<Ticket> tickets = mapper.selectByEventId(eventId);

			return tickets;
		} finally {
			session.close();
		}
	}

	public void insert(Ticket ticket) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			TicketMapper mapper = session.getMapper(TicketMapper.class);
			mapper.insert(ticket);
			
			session.commit();
		} finally {
			session.close();
		}
	}

	public void update(Ticket ticket) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			TicketMapper mapper = session.getMapper(TicketMapper.class);
			mapper.update(ticket);
			
			session.commit();
		} finally {
			session.close();
		}
	}

	public void delete(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			TicketMapper mapper = session.getMapper(TicketMapper.class);
			mapper.delete(id);
			
			session.commit();
		} finally {
			session.close();
		}
	}
}
