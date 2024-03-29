package ua.be.dc.services.sellingService.models;

public class EventOrganizer {

	private Integer id;
	private String token;
	private String serviceEndpoint;
	private String bankAccountNumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getServiceEndpoint() {
		return serviceEndpoint;
	}

	public void setServiceEndpoint(String serviceEndpoint) {
		this.serviceEndpoint = serviceEndpoint;
	}

	public String getAccountNumber() {
		return bankAccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.bankAccountNumber = accountNumber;
	}

}
