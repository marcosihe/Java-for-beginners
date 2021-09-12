package customer;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("line 1", "Mario Bravo 644",  "4000");
		Customer customer = new Customer("Marcos", homeAddress);
		
		Address workAddress = new Address("line 1 for work", "General Paz 544", "400");
		customer.setWorkAddress(workAddress);
		
		
		System.out.println(customer);
	}

}
