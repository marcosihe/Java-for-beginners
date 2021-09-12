package arrays;

import java.util.Arrays;

public class Arrays_3 {

	public static void main(String[] args) {
		int [] marks = {100, 99, 95, 96, 100};
		System.out.println(Arrays.toString(marks));
		
		// Fill method
		
		int[] marks2 = new int[5];
		Arrays.fill(marks2, 100);
		System.out.println(Arrays.toString(marks2));
		
		Arrays.fill(marks, 50);
		System.out.println(Arrays.toString(marks));
		
		// Equals method
		int [] referenceArray = {50,50,50,50,50};
		boolean result = Arrays.equals(marks, referenceArray);
		System.out.println(result);
		System.out.println(Arrays.equals(marks, marks2));
		
		// Sort method
		int[] arr = {5,4,9,3,4,7,1};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		/*
		 * Agregar o remover un elemento de un array no es posible con este tipo de datos,
		 * pues el espacio del mismo ya está definido y no puede modificarse. Pero, se 
		 * puede hacer lo siguiente, definiendo nuevos arrays con la longitud necesaria:
		 * 
		 * int[] newArr = new int[arr.length + 1];
		 * Luego se puede copiar el contenido del array arr y agregarle el nuevo elemento 
		 * en la última posición.
		 * 
		 * Ocurre similar para remover:
		 * int []  newArrWithOneElementDeleted = new int[arr.length - 1];
		 * 
		 * Ahora se copia lo que se quiere de arr y listo.
		*/
	}

}
