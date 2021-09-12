package inheritance;

public class Student extends Person{
	
	private String collegeName;
	private int year;
	
	// constructor method
	public Student(String name, String email, String collegeName, int year) {
		super(name, email);
		this.collegeName = collegeName;
		this.year = year;
	}
	
	public String getCollege() {
		return collegeName;
	}
	public void setCollege(String college) {
		this.collegeName = college;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString(){
		return getName() + " - " + collegeName + " - " + year;
	}
	
}
