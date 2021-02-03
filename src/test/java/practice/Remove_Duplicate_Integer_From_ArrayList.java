package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class Remove_Duplicate_Integer_From_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(11,11,21,21,31,41));
		HashSet<Integer> set = new HashSet<Integer>();
		for(Integer number:list) {
			set.add(number);
		}
		System.out.println(set);
		System.out.println("***********************");
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(Integer number:list) {
			if(!arrayList.contains(number)) {
				arrayList.add(number);
			}
		}
		System.out.println(arrayList);
	}
}
