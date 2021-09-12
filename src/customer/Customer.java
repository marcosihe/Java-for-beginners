package customer;

public class Customer {
	
	// state
	private String name;
	private Address homeAddress, workAddress;
	
	// creating
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}
	
	// operations - getters & setters
	public Address getAddress() {
		return homeAddress;
	}

	public void setAddress(Address address) {
		this.homeAddress = address;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	// other methods
	public String toString() {
		return String.format("name - [%s] home address - [%s] work address - [%s]",
				name, homeAddress, workAddress);
	}
	
	
}
