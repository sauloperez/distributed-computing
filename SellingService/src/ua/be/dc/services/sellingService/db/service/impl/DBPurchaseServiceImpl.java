package ua.be.dc.services.sellingService.db.service.impl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.sellingService.db.dao.PurchaseDAO;
import ua.be.dc.services.sellingService.db.dao.exception.DAOException;
import ua.be.dc.services.sellingService.db.service.IDBPurchaseService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.Purchase;

public class DBPurchaseServiceImpl implements IDBPurchaseService {
	
	private static Logger logger = LogManager.getLogger(DBPurchaseServiceImpl.class.getName());
	
	private PurchaseDAO purchaseDAO = new PurchaseDAO();

	@Override
	public Purchase getById(Integer id) {
		Purchase purchase = purchaseDAO.selectById(id);
		
		if (purchase == null) {
			logger.trace("Purchase with ID " + id + " not found");
		}
		else {
			logger.trace("Retrieved purchase with ID " + id);
		}
		
		return purchase;
	}
	
	@Override
	public List<Purchase> getAll() {
		List<Purchase> purchases = purchaseDAO.selectAll();
		
		logger.trace("Retrieved " + purchases.size() + " purchases");
		
		return purchases;
	}

	@Override
	public void insert(Purchase purchase) throws DBServiceException {
		try {
			purchaseDAO.insert(purchase);
			
			logger.trace("Inserted purchase with ID " + purchase.getId());
		} catch (PersistenceException e) {
			throw new DBServiceException("The purchase could not be inserted. " + e.getMessage());
		}
	}

	@Override
	public void update(Purchase purchase) throws DBServiceException {
		try {
			purchaseDAO.update(purchase);

			logger.trace("Updated purchase with ID " + purchase.getId());
		} catch (DAOException e) {
			throw new DBServiceException("The purchase could not be updated. " + e.getMessage());
		}
		
	}

	@Override
	public void deleteById(Integer id) throws DBServiceException {
		try {
			purchaseDAO.delete(id);
			
			logger.trace("Deleted purchase with ID " + id);
		} catch (DAOException e) {
			throw new DBServiceException("The purchase could not be updated. " + e.getMessage());
		}
	}

}
