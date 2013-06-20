package ua.be.dc.services.bankService.fileService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.bankService.models.Transaction;

public class FileService {
	
	private static Logger logger = LogManager.getLogger(FileService.class.getName());

	private static String fileName = "moneyTransferRegistry.txt";
    private static String path = FileService.class.getResource("/").getPath();
    
    private Transaction sourceTx;
    private Transaction destTx;
    private String text = "";
    
    public FileService(Transaction sourceTx, Transaction destTx) {
    	this.sourceTx = sourceTx;
    	this.destTx = destTx;
    	setDefaultText();
    }
    
    private void setDefaultText() {
    	Calendar cal = Calendar.getInstance();
    	Date currentTime = cal.getTime();
    	
    	text = currentTime.toString() + ": Transfer of " + destTx.getAmount() + " euros made from " + sourceTx.getAccount().getNumber() + 
    			" to " + destTx.getAccount().getNumber() + ": \n\t" + sourceTx.toString() + "\n\t" + destTx.toString() + "\n\n";
    }
    
    /**
     * Writes a money transfer (represented by two related Transaction objects) content in human-readable format
     * 
     * @param transaction
     * @throws IOException 
     */
    public void write() throws IOException {
    	File file = new File(path + fileName);
    	if (!file.exists()) {
			file.createNewFile();
		}
    	
    	FileWriter fileWritter = new FileWriter(file.getAbsolutePath(),true);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        bufferWritter.write(text);
        bufferWritter.close();
        
        logger.trace("Transfer succesfully written in " + path + fileName);
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

	public Transaction getSourceTx() {
		return sourceTx;
	}

	public void setSourceTx(Transaction sourceTx) {
		this.sourceTx = sourceTx;
		setDefaultText();
	}

	public Transaction getDestTx() {
		return destTx;
	}

	public void setDestTx(Transaction destTx) {
		this.destTx = destTx;
		setDefaultText();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
    
}
