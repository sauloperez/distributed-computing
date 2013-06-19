package ua.be.dc.services.bankService.db.service.exception;

public class DBServiceNotEnoughFundsException extends DBServiceException {

	private static final long serialVersionUID = -7335466633474427623L;
	
	public DBServiceNotEnoughFundsException() {
		super();
	}

	public DBServiceNotEnoughFundsException(String message) {
		super(message);
	}

}
