package inheritance;

public class Person {
	
	// state
	private String name, email, phoneNumber;
	
	// constructor method
	public Person() {
		System.out.println("Person constructor");
	}
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}


	// getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return name + " - " + email + " - " + phoneNumber ;
	}
}
