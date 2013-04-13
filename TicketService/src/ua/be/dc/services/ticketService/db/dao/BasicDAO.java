package ua.be.dc.services.ticketService.db.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import ua.be.dc.services.ticketService.db.MyBatisConnectionFactory;

public abstract class BasicDAO {

	protected SqlSessionFactory sqlSessionFactory;
	
	public BasicDAO() {
		sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
	}
}
