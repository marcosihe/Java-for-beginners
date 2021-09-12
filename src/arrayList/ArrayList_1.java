package arrayList;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(1);
		System.out.println(arrayList);
		arrayList.add("cat");
		arrayList.add("dog");
		System.out.println(arrayList);
		arrayList.remove(1);
		System.out.println(arrayList);
		arrayList.remove("dog");
		System.out.println(arrayList);
	}

}
