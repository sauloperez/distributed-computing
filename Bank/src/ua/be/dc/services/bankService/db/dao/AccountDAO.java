package ua.be.dc.services.bankService.db.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.bankService.db.dao.exception.DAOException;
import ua.be.dc.services.bankService.db.mappers.AccountMapper;
import ua.be.dc.services.bankService.models.Account;

public class AccountDAO extends BasicDAO {

	public List<Account> selectAll() {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			AccountMapper mapper = session.getMapper(AccountMapper.class);
			List<Account> accounts = mapper.selectAll();

			return accounts;
		} finally {
			session.close();
		}
	}

	public Account selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			AccountMapper mapper = session.getMapper(AccountMapper.class);
			Account account = mapper.selectById(id);

			return account;
		} finally {
			session.close();
		}
	}
	
	public Account selectByNumber(String number) {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			AccountMapper mapper = session.getMapper(AccountMapper.class);
			Account account = mapper.selectByNumber(number);

			return account;
		} finally {
			session.close();
		}
	}

	public void insert(Account account) throws PersistenceException {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			AccountMapper mapper = session.getMapper(AccountMapper.class);
			mapper.insert(account);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(Account account) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			AccountMapper mapper = session.getMapper(AccountMapper.class);
			int affectedRows = mapper.update(account);
			if (affectedRows == 0) {
				throw new DAOException("The account with ID " + account.getId() + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delete(Integer id) throws DAOException {
		SqlSession session = sqlSessionFactory.openSession();

		try {
			AccountMapper mapper = session.getMapper(AccountMapper.class);
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
