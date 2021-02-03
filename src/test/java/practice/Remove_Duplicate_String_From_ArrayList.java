package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class Remove_Duplicate_String_From_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Java","java","Selenium"));
		HashSet<String> set = new HashSet<String>();
		for(String word:list) {
			set.add(word.toLowerCase());
		}
		System.out.println(set);
		
		System.out.println("*************************");
		
		ArrayList<String> arrayList = new ArrayList<String>();
		for(String word:list) {
			if(!arrayList.contains(word)) {
				arrayList.add(word.toLowerCase());
			}
		}
		System.out.println(arrayList);
	}
}
