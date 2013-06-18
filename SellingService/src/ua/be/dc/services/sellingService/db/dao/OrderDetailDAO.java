package ua.be.dc.services.sellingService.db.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.sellingService.db.dao.exception.DAOException;
import ua.be.dc.services.sellingService.db.mappers.OrderDetailMapper;
import ua.be.dc.services.sellingService.models.OrderDetail;

public class OrderDetailDAO extends BasicDAO {

	public List<OrderDetail> selectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			OrderDetailMapper mapper = session.getMapper(OrderDetailMapper.class);
			List<OrderDetail> orderDetails = mapper.selectAll();
			
			return orderDetails;
		} finally {
			session.close();
		}
	}
	
	public OrderDetail selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			OrderDetailMapper mapper = session.getMapper(OrderDetailMapper.class);
			OrderDetail orderDetail = mapper.selectById(id);
			
			return orderDetail;
		} finally {
			session.close();
		}
	}
	
	public List<OrderDetail> selectByOrderId(Integer orderId) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			OrderDetailMapper mapper = session.getMapper(OrderDetailMapper.class);
			List<OrderDetail> orderDetails = mapper.selectByOrderId(orderId);
			
			return orderDetails;
		} finally {
			session.close();
		}
	}
	
	public void insert(OrderDetail orderDetail) throws PersistenceException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			OrderDetailMapper mapper = session.getMapper(OrderDetailMapper.class);
			mapper.insert(orderDetail);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(OrderDetail orderDetail) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			OrderDetailMapper mapper = session.getMapper(OrderDetailMapper.class);
			int affectedRows = mapper.update(orderDetail);
			if (affectedRows == 0) {
				throw new DAOException("The orderDetail with ID " + orderDetail.getId() + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delete(Integer id) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			OrderDetailMapper mapper = session.getMapper(OrderDetailMapper.class);
			int affectedRows = mapper.delete(id);
			if (affectedRows == 0) {
				throw new DAOException("The orderDetail with ID " + id + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
}
