package ua.be.dc.services.seatAccommodation.db;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import ua.be.dc.services.seatAccommodation.db.mappers.EventMapper;
import ua.be.dc.services.seatAccommodation.db.mappers.SeatMapper;

public class MyBatisConnectionFactory {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	// path to myBatis configuration file.
	private static String resource = "ua/be/dc/services/seatAccommodation/db/myBatisConfig.xml";
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			if (sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

}
