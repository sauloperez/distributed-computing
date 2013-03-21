package ua.be.dc.services.seatAccommodation;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sun.xml.ws.runtime.dev.Session;

import ua.be.dc.services.seatAccommodation.db.dao.Event;
import ua.be.dc.services.seatAccommodation.db.sqlMappers.EventMapper;

public class MyBatisAction {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Since we're using a Java POJO to write query then we have to add the 
		// Mapper class to sqlSessionFactory configuration
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactorySingleton().getInstance();
		sqlSessionFactory.getConfiguration().addMapper(EventMapper.class);
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			EventMapper mapper = session.getMapper(EventMapper.class);
			
			printAll(mapper);
//			printById(mapper, 1);
//			printByName(mapper, "test event 0");
			
		} finally {
			session.close();
		}
	}
	
	public static void printAll(EventMapper mapper) {
		ArrayList<Event> events = (ArrayList<Event>) mapper.selectAll();
		for (Event event : events) {
			System.out.println(event.getName());
		}
	}
	
	public static void printById(EventMapper mapper, Integer id) {
		Event event = mapper.selectById(id);
		printEvent(event);
	}
	
	public static void printByName(EventMapper mapper, String name) {
		Event event = mapper.selectByName(name);
		printEvent(event);
	}
	
	public static void printEvent(Event event) {
		System.out.println(event.getId()+", "+event.getName());
	}
}
