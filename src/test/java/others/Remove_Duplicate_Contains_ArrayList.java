package others;

import java.util.ArrayList;

public class Remove_Duplicate_Contains_ArrayList {

	public static void main(String[] args) {
		ArrayList <String> arrayList = new ArrayList<String>();
		arrayList.add("Alok");
		arrayList.add("Kumar");
		arrayList.add("Barman");
		arrayList.add("Kumar");
//		System.out.println(arrayList);
		ArrayList<String> nameList = new ArrayList<String>();
//		System.out.print("Duplicate element: ");
		for (String name:arrayList) {
			if (nameList.contains(name)) {
				System.out.print(name+" ,");
			}
//			if (!nameList.contains(name)) {
//				System.out.println(nameList.add(name));
//			}
		}
		System.out.println();
//		System.out.println(nameList);
	}
}
