package ua.be.dc.services.bankService.db.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionManager;

import ua.be.dc.services.bankService.db.MyBatisConnectionFactory;

public abstract class BasicDAO {

	protected SqlSessionFactory sqlSessionFactory;
	protected SqlSessionManager sessionManager;
	
	public BasicDAO() {
		sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
		sessionManager = MyBatisConnectionFactory.getSqlSessionManager();
	}
}
