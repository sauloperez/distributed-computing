package ua.be.dc.services.sellingService.db.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.sellingService.db.dao.exception.DAOException;
import ua.be.dc.services.sellingService.db.mappers.CustomerMapper;
import ua.be.dc.services.sellingService.models.Customer;

public class CustomerDAO extends BasicDAO {

	public List<Customer> selectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			CustomerMapper mapper = session.getMapper(CustomerMapper.class);
			List<Customer> customers = mapper.selectAll();
			
			return customers;
		} finally {
			session.close();
		}
	}
	
	public Customer selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			CustomerMapper mapper = session.getMapper(CustomerMapper.class);
			Customer customer = mapper.selectById(id);
			
			return customer;
		} finally {
			session.close();
		}
	}
	
	public void insert(Customer customer) throws PersistenceException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			CustomerMapper mapper = session.getMapper(CustomerMapper.class);
			mapper.insert(customer);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(Customer customer) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			CustomerMapper mapper = session.getMapper(CustomerMapper.class);
			int affectedRows = mapper.update(customer);
			if (affectedRows == 0) {
				throw new DAOException("The customer with ID " + customer.getId() + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delete(Integer id) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			CustomerMapper mapper = session.getMapper(CustomerMapper.class);
			int affectedRows = mapper.delete(id);
			if (affectedRows == 0) {
				throw new DAOException("The customer with ID " + id + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
}
