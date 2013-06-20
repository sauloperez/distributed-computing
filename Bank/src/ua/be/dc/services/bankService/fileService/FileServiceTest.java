package ua.be.dc.services.bankService.fileService;

import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ua.be.dc.services.bankService.db.service.IDBTransactionService;
import ua.be.dc.services.bankService.db.service.impl.DBTransactionServiceImpl;
import ua.be.dc.services.bankService.models.Transaction;

public class FileServiceTest {
	
	private static FileService fileService;
	private static IDBTransactionService dbTransactionService;

	@Before
	public void setUp() throws Exception {
		dbTransactionService = new DBTransactionServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		dbTransactionService = null;
	}
	
	private void initFileService() {
		int sourceTxId = 66;
		int destTxId = 67;
		
		Transaction sourceTx = dbTransactionService.getById(sourceTxId);
		Transaction destTx = dbTransactionService.getById(destTxId);
		
		fileService = new FileService(sourceTx, destTx);
	}

	@Test
	public final void testFileService() {
		initFileService();
	}
	
	@Test
	public final void testWrite() {
		try {
			initFileService();
			fileService.write();
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
