package ua.be.dc.services.seatAccommodation.db.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import ua.be.dc.services.seatAccommodation.db.MyBatisConnectionFactory;

public abstract class BasicDAO {

	protected SqlSessionFactory sqlSessionFactory;
	
	public BasicDAO() {
		sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
	}
}
