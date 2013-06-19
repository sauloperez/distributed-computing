package ua.be.dc.services.bankService.db.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import ua.be.dc.services.bankService.db.MyBatisConnectionFactory;

public abstract class BasicDAO {

	protected SqlSessionFactory sqlSessionFactory;
	
	public BasicDAO() {
		sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
	}
}
