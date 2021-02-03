package practice;

import java.util.ArrayList;
import java.util.HashSet;
public class Remove_Duplicate_Integer_From_List {

	public static void main(String[] args) {
		Integer numbers[] = {10,10,20,20,30,40,50};
		HashSet<Integer> set = new HashSet<Integer>();
		for(Integer number:numbers) {
			set.add(number);
		}
		System.out.println(set);
		
		System.out.println("***********************");
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(Integer number:numbers) {
			if(!arrayList.contains(number)) {
				arrayList.add(number);
			}
		}
		System.out.println(arrayList);		
	}
}
