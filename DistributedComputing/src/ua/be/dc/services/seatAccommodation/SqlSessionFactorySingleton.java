package ua.be.dc.services.seatAccommodation;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactorySingleton {

	// path of the mybatis configuration file.
	public static String resource = "ua/be/dc/services/seatAccommodation/db/myBatisConfig.xml";

	private static SqlSessionFactory instance;
	
	SqlSessionFactorySingleton() {}
	
	public static synchronized SqlSessionFactory getInstance() {
		if (instance == null) {
			try {
				Reader reader = Resources.getResourceAsReader(resource);
				instance = new SqlSessionFactoryBuilder().build(reader); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return instance;
	}
}
