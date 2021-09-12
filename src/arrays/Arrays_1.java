package arrays;

public class Arrays_1 {

	public static void main(String[] args) {
		int[] marks = {75, 60, 56};
		int sum = 0;
		
		for(int mark:marks){
			sum += mark;
		}
		System.out.println(sum);
	}

}
