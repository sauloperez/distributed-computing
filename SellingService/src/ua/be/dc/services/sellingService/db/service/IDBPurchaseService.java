package ua.be.dc.services.sellingService.db.service;

import java.util.List;

import ua.be.dc.services.sellingService.models.Purchase;

public interface IDBPurchaseService {

	public Purchase getById(Integer id);

	public List<Purchase> getAll();

	public void insert(Purchase purchase);

	public void update(Purchase purchase);

	public void deleteById(Integer id);
}
