package ua.be.dc.services.sellingService.db.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.sellingService.db.dao.exception.DAOException;
import ua.be.dc.services.sellingService.db.mappers.OrderMapper;
import ua.be.dc.services.sellingService.models.Order;

public class OrderDAO extends BasicDAO {
	
	public List<Order> selectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			List<Order> orders = mapper.selectAll();
			
			return orders;
		} finally {
			session.close();
		}
	}
	
	public Order selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			Order order = mapper.selectById(id);
			
			return order;
		} finally {
			session.close();
		}
	}
	
	public Order selectByToken(String token) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			Order order = mapper.selectByToken(token);
			
			return order;
		} finally {
			session.close();
		}
	}
	
	public void insert(Order order) throws PersistenceException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			mapper.insert(order);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(Order order) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			int affectedRows = mapper.update(order);
			if (affectedRows == 0) {
				throw new DAOException("The order with ID " + order.getId() + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delete(Integer id) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			int affectedRows = mapper.delete(id);
			if (affectedRows == 0) {
				throw new DAOException("The order with ID " + id + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
}
