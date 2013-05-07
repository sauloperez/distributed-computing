package ua.be.dc.services.sellingService.db.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import ua.be.dc.services.sellingService.db.MyBatisConnectionFactory;

public abstract class BasicDAO {

	protected SqlSessionFactory sqlSessionFactory;

	public BasicDAO() {
		sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
	}
}
