package ua.be.dc.services.bankService.db.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.bankService.db.dao.exception.DAOException;
import ua.be.dc.services.bankService.db.mappers.TransactionMapper;
import ua.be.dc.services.bankService.models.Transaction;

public class TransactionDAO extends BasicDAO {

	public List<Transaction> selectAll() {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			TransactionMapper mapper = session.getMapper(TransactionMapper.class);
			List<Transaction> transactions = mapper.selectAll();

			return transactions;
		} finally {
			session.close();
		}
	}

	public Transaction selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			TransactionMapper mapper = session.getMapper(TransactionMapper.class);
			Transaction transaction = mapper.selectById(id);

			return transaction;
		} finally {
			session.close();
		}
	}
	
	public List<Transaction> selectByAccountId(Integer accountId) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			TransactionMapper mapper = session.getMapper(TransactionMapper.class);
			List<Transaction> transactions = mapper.selectByAccountId(accountId);

			return transactions;
		} finally {
			session.close();
		}
	}
	
	public void insert(Transaction transaction) throws PersistenceException {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			TransactionMapper mapper = session.getMapper(TransactionMapper.class);
			mapper.insert(transaction);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(Transaction transaction) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			TransactionMapper mapper = session.getMapper(TransactionMapper.class);
			int affectedRows = mapper.update(transaction);
			if (affectedRows == 0) {
				throw new DAOException("The transaction with ID " + transaction.getId() + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delete(Integer id) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			TransactionMapper mapper = session.getMapper(TransactionMapper.class);
			int affectedRows = mapper.delete(id);
			if (affectedRows == 0) {
				throw new DAOException("The chanel with ID " + id + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
}
