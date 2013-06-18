package ua.be.dc.services.sellingService.db.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.sellingService.db.dao.exception.DAOException;
import ua.be.dc.services.sellingService.db.mappers.TicketDetailMapper;
import ua.be.dc.services.sellingService.models.TicketDetail;

public class TicketDetailDAO extends BasicDAO {

	public List<TicketDetail> selectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			TicketDetailMapper mapper = session.getMapper(TicketDetailMapper.class);
			List<TicketDetail> ticketDetails = mapper.selectAll();
			
			return ticketDetails;
		} finally {
			session.close();
		}
	}
	
	public TicketDetail selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			TicketDetailMapper mapper = session.getMapper(TicketDetailMapper.class);
			TicketDetail ticketDetail = mapper.selectById(id);
			
			return ticketDetail;
		} finally {
			session.close();
		}
	}
	
	public List<TicketDetail> selectByOrderDetailId(Integer orderDetailId) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			TicketDetailMapper mapper = session.getMapper(TicketDetailMapper.class);
			List<TicketDetail> ticketDetails = mapper.selectByOrderDetailId(orderDetailId);
			
			return ticketDetails;
		} finally {
			session.close();
		}
	}
	
	public void insert(TicketDetail ticketDetail) throws PersistenceException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			TicketDetailMapper mapper = session.getMapper(TicketDetailMapper.class);
			mapper.insert(ticketDetail);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(TicketDetail ticketDetail) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			TicketDetailMapper mapper = session.getMapper(TicketDetailMapper.class);
			int affectedRows = mapper.update(ticketDetail);
			if (affectedRows == 0) {
				throw new DAOException("The ticketDetail with ID " + ticketDetail.getId() + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delete(Integer id) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			TicketDetailMapper mapper = session.getMapper(TicketDetailMapper.class);
			int affectedRows = mapper.delete(id);
			if (affectedRows == 0) {
				throw new DAOException("The ticketDetail with ID " + id + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}

}
