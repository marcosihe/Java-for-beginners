package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
	
	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	
	public Student(String name, int... marks) {
		this.name = name;
		
		for(int mark: marks) {
			this.marks.add(mark);
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the marks
	 */
	public ArrayList<Integer> getMarks() {
		return marks;
	}

	/**
	 * @param marks the marks to set
	 */
	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}
	
	public int getNumberOfMarks() {
		return marks.size();
	}
	
	public int getMaximumMark() {
		return Collections.max(marks);
	}
	
	public int getMinimunMark() {
		return Collections.min(marks);
	}
	
	public String toString() {
		return name + marks;
	}
	
	public void addNewMark(int mark) {
		marks.add(mark);
	}
	
	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}

	public static void main(String[] args) {
		Student student = new Student("Marcos", 100,95,98,97,96,81,100);
		System.out.println(student.getNumberOfMarks());
		System.out.println(student.getMaximumMark());
		System.out.println(student.getMinimunMark());
		System.out.println(student.toString());
		
		student.addNewMark(58);
		System.out.println(student.toString());
		
		student.removeMarkAtIndex(3);
		System.out.println(student.toString());
	}

}
