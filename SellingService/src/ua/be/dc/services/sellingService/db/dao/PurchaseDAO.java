package ua.be.dc.services.sellingService.db.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import ua.be.dc.services.sellingService.db.mappers.PurchaseMapper;
import ua.be.dc.services.sellingService.models.Purchase;

public class PurchaseDAO extends BasicDAO {

	public List<Purchase> selectAll() {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			PurchaseMapper mapper = session.getMapper(PurchaseMapper.class);
			List<Purchase> purchases = mapper.selectAll();
			
			return purchases;
		} finally {
			session.close();
		}
	}
	
	public Purchase selectById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			PurchaseMapper mapper = session.getMapper(PurchaseMapper.class);
			Purchase purchase = mapper.selectById(id);
			
			return purchase;
		} finally {
			session.close();
		}
	}
	
	public void insert(Purchase purchase) throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			PurchaseMapper mapper = session.getMapper(PurchaseMapper.class);
			mapper.insert(purchase);
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void update(Purchase purchase) throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			PurchaseMapper mapper = session.getMapper(PurchaseMapper.class);
			int affectedRows = mapper.update(purchase);
			if (affectedRows == 0) {
				throw new Exception("The purchase with ID " + purchase.getId() + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public void delete(Integer id) throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			PurchaseMapper mapper = session.getMapper(PurchaseMapper.class);
			int affectedRows = mapper.delete(id);
			if (affectedRows == 0) {
				throw new Exception("The purchase with ID " + id + " does not exist");
			}
			
			session.commit();
		} finally {
			session.close();
		}
	}
}
