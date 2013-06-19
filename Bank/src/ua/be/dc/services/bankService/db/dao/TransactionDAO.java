package ua.be.dc.services.bankService.db.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionManager;
import org.apache.ibatis.session.TransactionIsolationLevel;

import com.sun.xml.ws.runtime.dev.SessionManager;

import ua.be.dc.services.bankService.db.dao.exception.DAOException;
import ua.be.dc.services.bankService.db.mappers.AccountMapper;
import ua.be.dc.services.bankService.db.mappers.TransactionMapper;
import ua.be.dc.services.bankService.models.Account;
import ua.be.dc.services.bankService.models.Transaction;

public class TransactionDAO extends BasicDAO {
	
	private static AccountDAO accountDAO = new AccountDAO();
	
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
	
	public void create(Account sourceAccount, Account destAccount, float amount) throws PersistenceException, DAOException {
		// Start a new SqlSession and get the mappers
		sessionManager.startManagedSession(ExecutorType.BATCH, TransactionIsolationLevel.READ_COMMITTED);

		try {
	        AccountMapper accountMapper = sessionManager.getMapper(AccountMapper.class);
	        TransactionMapper transactionMapper = sessionManager.getMapper(TransactionMapper.class);
	        
			// Update the source account's balance
	        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
	        accountMapper.update(sourceAccount);
			
			// Update the destination account's balance
	        destAccount.setBalance(destAccount.getBalance() + amount);
	        accountMapper.update(destAccount);
			
			// TODO TransactionService to store tx in file besides the DB insert
			// Build a transaction for each account so the users will be able to list
			// the money movements of their accounts
			Transaction transaction = new Transaction();
			transaction.setAmount(-amount);
			transaction.setAccount(sourceAccount);
			transaction.setBalance(sourceAccount.getBalance());
	//		transaction.setDescription(description);
			transactionMapper.insert(transaction);
			
			if (sourceAccount.getTransactions() == null) {
				List<Transaction> transactions = new ArrayList<>();
				sourceAccount.setTransactions(transactions);
			}
			sourceAccount.getTransactions().add(transaction);
			
			transaction = new Transaction();
			transaction.setAmount(amount);
			transaction.setAccount(destAccount);
			transaction.setBalance(destAccount.getBalance());
	//		transaction.setDescription(description);
			transactionMapper.insert(transaction);
			
			if (destAccount.getTransactions() == null) {
				List<Transaction> transactions = new ArrayList<>();
				destAccount.setTransactions(transactions);
			}
			destAccount.getTransactions().add(transaction);
			
			sessionManager.commit();
		} catch (Throwable t) {
	        sessionManager.rollback();
	        throw new DAOException("Database transaction rolled back");
	    } finally {
	        sessionManager.close();
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
