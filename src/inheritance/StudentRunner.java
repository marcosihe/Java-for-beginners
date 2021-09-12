package inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		
		Student student = new Student("Marcos Herrera", "mhe@gmail.com", "Escuela Normal", 2008);
		student.setEmail("meherrera@gmail.com");
		student.setPhoneNumber("3816703322");
		System.out.println(student);
		
		
		Person person = new Person();
		person.setName("Lucia");
		person.setEmail("lu@gmail.com");
		person.setPhoneNumber("3816214578");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
	}

}
