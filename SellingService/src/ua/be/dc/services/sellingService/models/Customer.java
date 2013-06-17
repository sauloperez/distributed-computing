package ua.be.dc.services.sellingService.models;

public class Customer {

	private Integer id;
	private String name;
	private String surname;
	private String country;
	private String address;
	private String phone;
	private String email;
	
	public Customer() {
	}

	public Customer(int customerId) {
		id = customerId;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String toString() {
		return "Customer: [id = " + id + ", name = " + name + ", surname = " + surname + ", address = " + address + ", country = " + country + ", phone = " + phone + ", email = " + email + "]";
	}
}
