package arrays;

import java.util.Arrays;

public class Arrays_2 {
	
	public void printElements(int[] array) {
		for(int element: array) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		Arrays_2 arrayPractice = new Arrays_2();
		
		//
		int[] marks = {75, 60, 56};
		arrayPractice.printElements(marks);
		
		// 
		int[] marks2 = {1};
		arrayPractice.printElements(marks2);
		
		//
		int[] marks3 = new int[4];
		arrayPractice.printElements(marks3);
		
		//
		marks3[0] = 999;
		System.out.println(marks3[0]);
		
		// double
		double[] values = new double[3];
		for(double item: values) {
			System.out.println(item);
		}
		
		// Boolean: se inicializan en false por defecto
		boolean[] test = new boolean[3];
		for(boolean item: test) {
			System.out.println(item);
		}
		
		// class: se inicializan en null por defecto
		Arrays_2[] arrays = new Arrays_2[3];
		//System.out.println(arrays[0]);
		for(Arrays_2 item: arrays) {
			System.out.println(item);
		}
		
		// Otra forma de mostrarlos
		System.out.println(Arrays.toString(marks));
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(arrays));
		
	}

}
