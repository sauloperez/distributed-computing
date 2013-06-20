package ua.be.dc.services.sellingService.db.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.sellingService.db.dao.exception.DAOException;
import ua.be.dc.services.sellingService.db.mappers.BankMapper;
import ua.be.dc.services.sellingService.models.Bank;

public class BankDAO extends BasicDAO {

	public List<Bank> selectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			BankMapper mapper = session.getMapper(BankMapper.class);
			List<Bank> banks = mapper.selectAll();
			
			return banks;
		} finally {
			session.close();
		}
	}
	
	public Bank selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			BankMapper mapper = session.getMapper(BankMapper.class);
			Bank bank = mapper.selectById(id);
			
			return bank;
		} finally {
			session.close();
		}
	}
	
	public Bank selectByCodeId(String bankCodeId) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			BankMapper mapper = session.getMapper(BankMapper.class);
			Bank bank = mapper.selectByCodeId(bankCodeId);
			
			return bank;
		} finally {
			session.close();
		}
	}
	
	public void insert(Bank bank) throws PersistenceException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			BankMapper mapper = session.getMapper(BankMapper.class);
			mapper.insert(bank);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(Bank bank) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			BankMapper mapper = session.getMapper(BankMapper.class);
			int affectedRows = mapper.update(bank);
			if (affectedRows == 0) {
				throw new DAOException("The bank with ID " + bank.getId() + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delete(Integer id) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			BankMapper mapper = session.getMapper(BankMapper.class);
			int affectedRows = mapper.delete(id);
			if (affectedRows == 0) {
				throw new DAOException("The bank with ID " + id + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
}
