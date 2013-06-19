package ua.be.dc.services.bankService.fileService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.bankService.models.Transaction;

public class FileService {
	
	private static Logger logger = LogManager.getLogger(FileService.class.getName());

	private static String fileName = "moneyTransferRegistry.txt";
    private static String path = "/Users/Pau/git/distributedComputing/Bank/";
    
    /**
     * Writes a money transfer (represented by two related Transaction objects) content in human-readable format
     * 
     * @param transaction
     * @throws IOException 
     */
    public void write(Transaction sourceTx, Transaction destTx) throws IOException {
    	logger.trace("Getting file...");
    	
    	String text = "Transfer of " + destTx.getAmount() + " euros made from " + sourceTx.getAccount().getNumber() + 
    			" to " + destTx.getAccount().getNumber() + ": \n\t" + sourceTx.toString() + "\n\t" + destTx.toString() + "\n\n";
    	
    	File file = new File(path + fileName);
    	if (!file.exists()) {
			file.createNewFile();
		}

    	FileWriter fileWritter = new FileWriter(file.getName(),true);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        bufferWritter.write(text);
        bufferWritter.close();
        
        logger.trace("Transfer succesfully written in " + fileName);
    }

	public static String getFileName() {
		return fileName;
	}

	public static void setFileName(String fileName) {
		FileService.fileName = fileName;
	}

	public static String getPath() {
		return path;
	}

	public static void setPath(String path) {
		FileService.path = path;
	}
    
}
