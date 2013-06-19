package ua.be.dc.services.bankService.db;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionManager;

public class MyBatisConnectionFactory {
	
	private static SqlSessionFactory sqlSessionFactory;
	private static SqlSessionManager sqlSessionManager;
	
	// path to myBatis configuration file.
	private static String resource = "ua/be/dc/services/bankService/db/myBatisConfig.xml";
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			if (sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
			
			reader = Resources.getResourceAsReader(resource);
			if (sqlSessionManager == null) {
				sqlSessionManager = SqlSessionManager.newInstance(reader);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public static SqlSessionManager getSqlSessionManager() {
		return sqlSessionManager;
	}
	
}
